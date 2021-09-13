/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        double amount, tax, total;
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in); //Need two scanners here, one for string and numbers
        //We read the input from the users
        System.out.print("What is the order amount? ");
        amount = scan.nextDouble();
        System.out.print("What is the state? ");
        String abbrState = input.nextLine();
        //Making sure our tax percentage is numerically .055
        tax = 5.5 / 100;
        double newtax = tax * amount;
        //Displaying & calculating total for WI residents:
        if (abbrState.equalsIgnoreCase("WI")) {
            total = amount + newtax;
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", amount, newtax, total);
        }
        else {
            System.out.printf("The total is $%.2f.", amount);
        }
    }
}



