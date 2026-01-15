package com.example.kotlinbasics

data class PotionList(
    val name:String,
    val effect:String,
    val price: Int
);

fun main(){
    val potionList1=PotionList("Barif","Vertigo",500);
    val potionList2=PotionList("Co-Diovan","Nausea",1500);
    val potionList3=PotionList("Diovan","Vomiting",200);
    val totalPotionList = listOf(potionList1,potionList2,potionList3);
    println("Total Potion List:$totalPotionList");
}