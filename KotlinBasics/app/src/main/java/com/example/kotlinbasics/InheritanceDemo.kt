package com.example.kotlinbasics

fun main(){
    val objBase:BaseClass = BaseClass();
    objBase.printBase();

    val objDerived:DerivedClass = DerivedClass();
    objDerived.printBase();
    objDerived.role();
    objDerived.name();
}