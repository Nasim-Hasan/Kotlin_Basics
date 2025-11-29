package com.example.kotlinbasics

fun main(){
    //..Calling the Function...//
    makeCoffee(0,"Nasim");
    makeCoffee(1, "Hasan");
    makeCoffee(2, "Daniel");
    makeCoffee(3, "Haufmann");
    makeCoffee(-5," ");
}

//...Defining the Function...//
fun makeCoffee(sugarCount:Int, sugarFor:String){
  if(sugarCount==1){
      println("$sugarCount Spoon of Sugar for $sugarFor");
  } else if(sugarCount==0){
      println("No Sugar for $sugarFor");
  } else if(sugarCount<0){
      println("Invalid Input:Please Enter a Positive Number (>=0) for Sugar Count");
  } else if(sugarCount==2){
      println("$sugarCount Spoons of Sugar for $sugarFor");
  } else if(sugarCount==3){
      println("$sugarCount Spoons of Sugar for $sugarFor");
  }

}