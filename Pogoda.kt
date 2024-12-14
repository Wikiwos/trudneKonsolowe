package com.example.trudnekonsolowe

interface Weather {
    fun pogoda(): String
}

class Sunny : Weather {
    override fun pogoda(): String {
        return "Słonecznie"
    }
}

class Rainy : Weather {
    override fun pogoda(): String {
        return "Deszczowo"
    }
}

class Cloudy : Weather {
    override fun pogoda(): String {
        return "Pochmurno"
    }
}

class City(val name: String, val weather: Weather)


fun main() {
    val cities = listOf(
        City("Warszawa", Sunny()),
        City("Gdańsk", Rainy()),
        City("Kraków", Cloudy())
    )

    println("Wybierz miasto " + " 1 - Warszawa " + " 2 - Gdańsk" + " 3 - Kraków: ")

    val choice = readLine()?.toInt()

    val selectedCity = cities[choice!! - 1]
    println("Prognoza pogody dla ${selectedCity.name}: ${selectedCity.weather.pogoda()}")
}
