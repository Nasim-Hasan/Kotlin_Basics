package com.example.kotlinbasics

fun main(){
    println("Input the 1st Number:");
    val firstnumber = readln().toInt();
    println("Input the 2nd Number:");
    val secondnumber = readln().toInt();
    println("The Addition Result is:"+add(firstnumber,secondnumber));
}

fun add (a:Int,b:Int):Int{
    val result = a+b;
    return result;
}