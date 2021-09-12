package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.util.Calendar;

public class App {

    public static int areaFFMM (int num1, int num2) //Feet to Feet & Meters to Meters Calc
    {
        int aFFMM;
        aFFMM= num1 * num2;
        return aFFMM;
    }
    public static double areaFM (int num1, int num2) //Feet to Meters
    {
        double aMeters;
        aMeters = num1 * num2 * 0.09290304;
        return aMeters;
    }

    public static double areaMF (int num1, int num2) //Meters to Feet
    {
        double aMF;
        aMF = num1 * num2 * 3.28084;
        return aMF;
    }

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Will you be entering your values in feet or meters? ");
        String ans = input1.nextLine();

        if (ans.equals("feet")|| ans.equals("Feet")) {
            Scanner input2 = new Scanner(System.in);
            System.out.print("What is the length of the room in feet?");
            String str = input2.nextLine();
            int length;
            try {
                length = Integer.valueOf(str);
                if (length < 0) {
                    throw new IllegalArgumentException("Please no negative numbers.");
                }
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("You must enter a number.");
            }

            Scanner input3 = new Scanner(System.in);
            System.out.print("What is the width of the room in feet? ");
            String str2 = input3.nextLine();
            int width;
            try {
                width = Integer.valueOf(str2);
                if (width < 0) {
                    throw new IllegalArgumentException("Please no negative numbers.");
                }
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("You must enter a number.");
            }

            System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.\n");
            System.out.print("The area is.\n");
            int a;
            a= areaFFMM(length, width);
            double b;
            b= areaFM(length, width);
            System.out.print(a + " square feet.\n");
            System.out.print(b + " square meters.\n");
        }
        //User chooses meters
        else if (ans.equals("meters")|| ans.equals("Meters")){
            Scanner input2 = new Scanner(System.in);
            System.out.print("What is the length of the room in meters?");
            String str = input2.nextLine();
            int length;
            try {
                length = Integer.valueOf(str);
                if (length < 0) {
                    throw new IllegalArgumentException("Please no negative numbers.");
                }
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("You must enter a number.");
            }

            Scanner input3 = new Scanner(System.in);
            System.out.print("What is the width of the room in meters? ");
            String str2 = input3.nextLine();
            int width;
            try {
                width = Integer.valueOf(str2);
                if (width < 0) {
                    throw new IllegalArgumentException("Please no negative numbers.");
                }
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("You must enter a number.");
            }

            System.out.print("You entered dimensions of " + length + " meters by " + width + " meters.\n");
            System.out.print("The area is.\n");
            int a;
            a= areaFFMM(length, width);
            double b;
            b= areaMF(length, width);
            System.out.print(a + " square meters.\n");
            System.out.print(b + " square feet.\n");
        }
        else {
            System.out.print("sorry, you need to pick one\n");
        }
    }
}
