package com.RonenTGreat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int begin;
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to Mad Libs please select any of the mad libs to start");
            System.out.println("0: Quit");
            System.out.println("1:  STAR WARS");
            System.out.println("2: ");
            System.out.println("3: ");
            System.out.println("4: ");
            System.out.println("5: ");
            System.out.print(">> ");
            begin = keyboard.nextInt();
            if(begin == 0)
                break;
            else if(begin == 1){
                System.out.println("Good! Let's start. You chose Star Wars!");
                System.out.println("Please enter the following inputs.");
                System.out.print("Enter an adjective: ");
                String adjective1 = keyboard.next();
                System.out.print("Enter a noun: ");
                String noun1 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective2 = keyboard.next();
                System.out.print("Enter a noun(place): ");
                String noun2 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective3 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective4 = keyboard.next();
                System.out.print("Enter a plural noun(vehicle): ");
                String noun3 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective5 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective6 = keyboard.next();
                System.out.print("Enter a plural noun: ");
                String noun4 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective7 = keyboard.next();
                System.out.print("Enter a plural noun: ");
                String noun5 = keyboard.next();
                System.out.print("Enter a plural noun: ");
                String noun6 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective8 = keyboard.next();
                System.out.print("Enter a noun: ");
                String noun7 = keyboard.next();
                System.out.print("Enter a verb: ");
                String verb1 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective9 = keyboard.next();
                System.out.print("Enter a verb: ");
                String verb2 = keyboard.next();
                System.out.print("Enter a plural noun: ");
                String noun8 = keyboard.next();
                System.out.print("Enter a plural noun(type of job): ");
                String noun9 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective10 = keyboard.next();
                System.out.print("Enter a verb: ");
                String verb3 = keyboard.next();
                System.out.print("Enter an adjective: ");
                String adjective11 = keyboard.next();
                System.out.println("----------------");
                System.out.println("Star Wars Mad Libs");
                System.out.println("Star");

            }

        }

    }
}
