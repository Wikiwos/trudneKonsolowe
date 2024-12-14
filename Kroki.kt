package com.example.trudnekonsolowe

class StepCounter {
    var stepCount: Int = 0
        private set

    fun addSteps(steps: Int) {
        stepCount += steps
    }

    fun resetCounter() {
        stepCount = 0
    }

    companion object {
        fun defaultSteps(): Int {
            return 10000
        }
    }
}

fun main() {
    val stepCounter = StepCounter()

    stepCounter.addSteps(1000)
    println("Liczba kroków: ${stepCounter.stepCount}")

    stepCounter.addSteps(5000)
    println("Liczba kroków: ${stepCounter.stepCount}")

    stepCounter.resetCounter()
    println("Liczba kroków: ${stepCounter.stepCount}")

    println("Domyślna liczba kroków na dzień: ${StepCounter.defaultSteps()}")
}
