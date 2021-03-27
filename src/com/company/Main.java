package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;

        while (true) {
            try {
                System.out.print("Enter the first number:  ");
                firstNumber = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the second number:  ");
                secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(firstNumber + " / " + secondNumber + " = " + firstNumber / secondNumber);
                break;
            } catch (ArithmeticException exception) {
                System.out.println("You can't divide the number to 0!");
                System.out.println("Try again!");
            } catch (NumberFormatException exception) {
                System.out.println("Please enter numbers and not the text.");
                System.out.println("Try again!");
            }
        }
    }
}