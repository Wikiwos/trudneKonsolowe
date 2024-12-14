package com.example.trudnekonsolowe

class Book(val title: String, val author: String, val year: Int)

val booksList = mutableListOf<Book>()

fun addBook(title: String, author: String, year: Int) {
    val newBook = Book(title, author, year)
    booksList.add(newBook)
}

fun filterBooksByAuthor(author: String): List<Book> {
    return booksList.filter { it.author == author }
}

fun filterBooksByYear(year: Int): List<Book> {
    return booksList.filter { it.year == year }
}

fun sortBooksByTitle(): List<Book> {
    return booksList.sortedBy { it.title }
}

fun displayBooks(): List<Book> {
    return booksList
}

fun displayAllBooks() {
    val allBooks = displayBooks()
    for (book in allBooks) {
        println("${book.title} ${book.author}, ${book.year}")
    }
}

fun filterByAuthor(author: String) {
    val filteredBooks = filterBooksByAuthor(author)
    for (book in filteredBooks) {
        println("${book.title}: ${book.author}, ${book.year}")
    }
}

fun filterByYear(year: Int) {
    val filteredBooks = filterBooksByYear(year)
    for (book in filteredBooks) {
        println("${book.title}: ${book.author}, ${book.year}")
    }
}

fun sortBooks() {
    val sortedBooks = sortBooksByTitle()
    for (book in sortedBooks) {
        println("${book.title}: ${book.author}, ${book.year}")
    }
}

fun main() {
    addBook("Morderstwo w Orient Expresie", "Agatha Cristie", 1934)
    addBook("Smierć na Nilu", "Agatha Cristie", 1937)
    addBook("Ten Little Niggers", "Agatha Cristie", 1939)
    addBook("W Pustyni i W Puszczy", "Henryk Sienkiewicz", 1911)

    println("Wszytkie książki: ")
    displayAllBooks()
    println()

    println("Po Autorze: ")
    filterByAuthor("Agatha Cristie")
    println()

    println("Po roku wydania: ")
    filterByYear(1939)
    println()

    println("Posortowane książki: ")
    sortBooks()
}
