package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfARectangle {
        public static void main(String[] args) {
            Scanner Scan = new Scanner(System.in);
            boolean validInput = false;
            while (!validInput) {
                try {

                    System.out.print("Enter the length for the rectangle: ");
                    int length = Scan.nextInt();
                    System.out.print("Enter the width for the rectangle: ");
                    int breath = Scan.nextInt();

                    int Area = length * breath;

                    System.out.println("the area of the rectangle is :" + Area);
                    validInput = true;
                    System.out.println("this change is after a new branch, branch-1");

                    System.out.println("this change is after a new branch, branch-2");
                } catch (InputMismatchException e) {
                    System.out.println("invalid input pplease enter integers only: ");
                    Scan.nextLine();
                }

            }

        }
    }

