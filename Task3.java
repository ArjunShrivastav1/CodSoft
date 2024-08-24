//    Task - 3  =>  Atm Interface

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkpin();
    }
}

class Atm {
    float balance = 5000;
    int PIN = 3325;

    void checkpin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if (entered_pin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin.");
            checkpin();
        }
        sc.close();
    }

    void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            withdraw_money();
        } else if (choice == 3) {
            deposit_money();
        } else if (choice == 4) {
            checkpin();
        } else {
            System.out.println("Please enter a valid choice.");
        }
        sc.close();
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
        System.out.println();
        menu();
    }

    void withdraw_money() {
        System.out.println("Enter Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money Withdrawn Successfully");
            System.out.println();
        }
        menu();
        sc.close();
    }

    void deposit_money() {
        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited successfully");
        System.out.println();
        menu();
        sc.close();
    }
}