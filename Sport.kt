package com.example.trudnekonsolowe

class Match(val points: Int)

class Results(private val matches: List<Match>) {

    fun averagePoints(): Double {
        return matches.map { it.points }.average()
    }

    fun highestScore(): Int? {
        return matches.maxOfOrNull { it.points }
    }

    fun lowestScore(): Int? {
        return matches.minOfOrNull { it.points }
    }

    fun totalPoints(): Int {
        return matches.sumOf { it.points }
    }

}

fun main() {
    val matches = listOf(
        Match(85),
        Match(92),
        Match(78),
        Match(101),
        Match(63),
        Match(99)
    )

    val analyzer = Results(matches)

    println("Średnia liczba punktów: ${analyzer.averagePoints()}")
    println("Najwyższy wynik: ${analyzer.highestScore()}")
    println("Najniższy wynik: ${analyzer.lowestScore()}")
    println("Łączna liczba punktów: ${analyzer.totalPoints()}")
}
