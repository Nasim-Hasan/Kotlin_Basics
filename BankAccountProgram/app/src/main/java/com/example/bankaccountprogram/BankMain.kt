package com.example.bankaccountprogram

fun main(){
    val bankAccount = BankAccount("Nasim Hasan",450.78);
    println("Account Holder's Name:"+bankAccount.accountHolder+
            " , Current Balance="+bankAccount.balance);
}