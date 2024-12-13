import kotlin.random.Random

object Quotes {
    private val quotesList = mutableListOf(
        "To co znajduje się na górze, jest wyżej niż to, co znajduje się na dole - Bożenna Szuszkiewicz",
        "Prosty teścik - Adam Roman",
        "Morał z dzisiejszej lekci. Nie zadzieraj z murzynem, bo może zabić - Marcin Kowalczyk",
    )

    fun getRandomQuote(): String {
        return quotesList.random()
    }

    fun addQuote(quote: String) {
        quotesList.add(quote)
    }
}

fun main() {
    while (true) {
        println("1. Losuj cytat")
        println("2. Dodaj nowy cytat")
        println("Wybierz opcję:")

        when (readLine()) {
            "1" -> {
                println("Losowy cytat: ${Quotes.getRandomQuote()}")
            }
            "2" -> {
                println("Dodaj cytat:")
                val newQuote = readLine()
                val newnewQuote: String = newQuote.toString()
                Quotes.addQuote(newnewQuote)
            }
        }
    }
}
