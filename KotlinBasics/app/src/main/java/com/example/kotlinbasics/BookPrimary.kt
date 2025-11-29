package com.example.kotlinbasics

class BookPrimary (val title:String = "Unknown",val author:String = "Anonymous",val yearPublished:Int = 2025){

    init{
        println("Book Title:$title, Book Author:$author, Book Published Year:$yearPublished");
    }
}