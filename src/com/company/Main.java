package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            int secondFinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your final score was " + finalScore);
            System.out.println("The second final score was " + secondFinalScore);
        }
    }
}
