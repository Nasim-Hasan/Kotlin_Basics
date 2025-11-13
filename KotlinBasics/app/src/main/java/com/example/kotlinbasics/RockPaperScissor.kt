package com.example.kotlinbasics

fun main(){
    var computerChoice = "";
    var playerChoice = "";

    //..Determining the Player's Choice..//
    println("Rock, Paper or Scissor? Enter the player's choice:");
    playerChoice = readln();

    //...Validating Player's Input...//
    while(playerChoice!="Rock" && playerChoice!="Paper" && playerChoice!="Scissor"){
        println("Enter a valid choice (Rock, Paper, Scissor):");
        playerChoice = readln();
    }

    //..Determining the Computer's Choice..//
    val rand = (1..3).random();
    if(rand==1){
        computerChoice = "Rock";
    } else if(rand==2){
        computerChoice = "Paper";
    }else if (rand==3){
        computerChoice = "Scissor";
    }

    println("Computer's choice:$computerChoice");

    //..Determining the Winner with When Statement...//
    val winner = when{
        playerChoice==computerChoice -> "Draw/Tie"
        playerChoice=="Rock" && computerChoice=="Scissor" -> "Player Wins"
        playerChoice=="Paper" && computerChoice=="Rock" -> "Player Wins"
        playerChoice=="Scissor" && computerChoice=="Paper" -> "Player Wins"
        else->"Computer Wins"
    };

    println("Result is:$winner");

}