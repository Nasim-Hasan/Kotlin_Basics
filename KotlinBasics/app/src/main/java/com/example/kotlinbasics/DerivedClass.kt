package com.example.kotlinbasics

class DerivedClass:BaseClass(),DerivedInterface {

    override fun role(){
        super.role();
        println("This is Child");
    }

    override fun name (){
        super.name();
    }
}