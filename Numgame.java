package com.java;
import java.util.Random;
import java.util.Scanner;

public class Numgame{
    public static int random(){
        Random rand = new Random();
        int num = rand.nextInt(30);
        return num;
    }
    public static void main(String[] args){
        System.out.println("Welcome!");
        System.out.println("A number is generated between 1-30, can you guess it?");

        int a = random();
        int input = 0;
        int attempts = 5;

        while(input != a && attempts !=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number: ");
            input = sc.nextInt();
            attempts--;

            if(input < a && attempts != 0){
                System.out.println("Too small..");
            }
            else if(input > a && attempts != 0){
                System.out.println("Too large..");
            }
            else if(attempts == 0){
                System.out.println("You have tried 5 times, GAME OVER!!");
            }
            else{
                System.out.println("YOU WON!!");
            }
        }
    }
}
