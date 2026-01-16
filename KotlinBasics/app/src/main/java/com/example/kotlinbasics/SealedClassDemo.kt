package com.example.kotlinbasics

sealed class UserInteraction {
    object Idle : UserInteraction();
    object Loading : UserInteraction();
    data class Success(val message: String) : UserInteraction();
    data class Failure(val error: String) : UserInteraction();
}

fun handleUserInteraction(state: UserInteraction) {
    when (state) {
        is UserInteraction.Idle -> println("User is idle.");
        is UserInteraction.Loading -> println("Loading...");
        is UserInteraction.Success -> println("Success: ${state.message}");
        is UserInteraction.Failure -> println("Error: ${state.error}");
    }
}

fun main() {
    val interaction1: UserInteraction = UserInteraction.Idle;
    val interaction2: UserInteraction = UserInteraction.Loading;
    val interaction3: UserInteraction = UserInteraction.Success("Data loaded successfully");
    val interaction4: UserInteraction = UserInteraction.Failure("Failed to load data");

    handleUserInteraction(interaction1);
    handleUserInteraction(interaction2);
    handleUserInteraction(interaction3);
    handleUserInteraction(interaction4);
}