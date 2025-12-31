package com.example.kotlinbasics

fun main(){
    //...Single Argument....//
    val doubleNumber = {x:Int->x*2};
    println("The Result of Multiplication:"+doubleNumber(5).toString());

    val greet = {name:String-> "Hello,$name" };
    println(greet("Nasim"));

    //...Multiple Arguments...//
    val sum = {x:Int, y:Int ->x+y};
    println("The Result of Addition:"+sum(10,20).toString());

    //...Lambda as a Function Argument...//
    println("The Result of Subtraction:"+performOperation (10,5){a,b->a-b}.toString());

    //...Manipulating Collections...//
    val numbers = listOf(1, 2, 3, 4, 5);
    val doubled = numbers.map { it * 2 };
    println("Doubled Mapping:$doubled");

    val evenNumbers = numbers.filter { it%2==0 };
    println("Even Numbers:$evenNumbers");
}

fun performOperation(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b);
}