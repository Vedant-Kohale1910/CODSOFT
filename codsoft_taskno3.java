package com.java;
import java.util.Scanner;

public class atminterface {

    public static float balance;
    public static float withdraw;
    public static int prompt;

    public static float deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please deposit balance in your account: ");
        balance = sc.nextFloat();
        System.out.println("Amount of rupees " + balance + " /- is credited to your account.");
        return balance;
    }

    public static void checkbalance() {
        System.out.println(balance);
    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        withdraw = sc.nextFloat();

        if (withdraw < balance) {
            System.out.println("Amount of rupees " + withdraw + " /- is debited from your account.");
            balance = balance - withdraw;
        } else if (withdraw > balance)
            System.out.println("Insufficient Balance!");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose any Option: ");
            System.out.println("Withdraw: 1\nCheck Balance: 2\nDeposit: 3\nExit: 4");
            int prompt = sc.nextInt();
            if (prompt == 1) {
                withdraw();
            } else if (prompt == 2) {
                checkbalance();
            } else if (prompt == 3) {
                deposit();
            } else if (prompt == 4) {
                break;
            }
        } while (prompt != 4);
        System.out.println("Thank you, Please visit us again!");
    }
}
