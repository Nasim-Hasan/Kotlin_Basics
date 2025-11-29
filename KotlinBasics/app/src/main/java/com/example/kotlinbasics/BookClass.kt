package com.example.kotlinbasics

fun main(){
    val objBook = BookPrimary();
    val customBook = BookSecondary("Harry Porter","J.K.Rowling",2001);

    println("Book Title:${customBook.title}, Book Author:${customBook.author}, " +
            "Book Published Year:${customBook.yearPublished}");
}