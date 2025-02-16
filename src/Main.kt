fun main() {

var book1= Book("The Hobbit",  "Robert",2005, genre = "Fantasy")

book1.getBookInfo()



//    println(book1.title + " " + book1.author+ "  " + book1.yearPublished)
//    println("Book: ${book1.title}")
}



class Book(var title: String,var author: String,var yearPublished: Int, var genre: String) {


    fun getBookInfo(){
        println("Title: $title , Author: $author, yearPublished: $yearPublished, genre: $genre")
    }
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 1000
}