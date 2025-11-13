package com.example.kotlinbasics

fun main()
{
    //..Printing Message in Console...//
    println("Hello kotlin!!!");

    //...Variables Manipulation...//
    val num = 100; //..Static/Immutable Variable...//
    println("Num Value:$num");

    var num1=200; //...Non-Static/Mutable Variable..//
    println("Initial Num1 Value:$num1");
    num1++;
    println("Modified Num1 Value:$num1");

    //...Boolean Variables...//
    var myTrue = true;
    var myFalse = false;
    println("Result:"+ (myTrue || myFalse)); //..True../
    println("Result:"+ (myTrue && myFalse)); //..False..//
    println("Result:"+ !(myTrue)); //..False..//
    println("Result:"+ !(myFalse)); //..True..//

    //..Unicode Character...//
    val myChar = '\u263A';
    println("Unicode Character is:"+myChar);

    //..Strings..//
    val myFirstName= "Nasim";
    val myLastName= "Hasan";
    println("My Full Name:"+myFirstName+ " "+myLastName);

}