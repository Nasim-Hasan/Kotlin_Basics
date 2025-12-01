package com.example.bankaccountprogram

fun main(){
    val bankAccount = BankAccount("Nasim Hasan",450.78);
    println("Account Holder's Name:"+bankAccount.accountHolder+
            " , Current Balance="+bankAccount.balance);
    bankAccount.deposit(0.0);
    bankAccount.deposit(100.0);
    bankAccount.withdraw(-100.0);
    bankAccount.withdraw(1200.0);
    bankAccount.withdraw(200.0);
    bankAccount.displayTransactionHistory();
    println("After the transactions "+bankAccount.accountHolder+
            "'s Current Balance="+bankAccount.balance);
}