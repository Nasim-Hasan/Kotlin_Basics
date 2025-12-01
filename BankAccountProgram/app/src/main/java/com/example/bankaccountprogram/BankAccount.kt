package com.example.bankaccountprogram

class BankAccount (val accountHolder:String,var balance:Double) {
    private val transactionHistory = mutableListOf<String>();

    fun deposit(amount:Double){
        if(amount>0){
            balance+=amount;
            transactionHistory.add("Deposit: $amount");
        }else{
            println("Invalid deposit amount");
        }

    }
    fun withdraw (amount:Double){
        if(amount>0 && amount<=balance) {
            balance -= amount;
            transactionHistory.add("Withdraw: $amount");
        }else{
            println("Invalid withdraw amount or insufficient balance");
        }

    }
    fun displayTransactionHistory(){
        println("Transaction History for $accountHolder:");
        transactionHistory.forEach{
            println(it);
        }

    }
}