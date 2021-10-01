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
            System.out.println("2: PIZZA");
            System.out.println("3: HAUNTED HOUSE");
            System.out.println("4: MOON LANDING");
            System.out.println("5: ROAD TRIP");
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

                System.out.println("-------------------------------------------------");
                System.out.println("""
                              ________________.  ___     .______
                             /                | /   \\    |   _  \\
                            |   (-----|  |----`/  ^  \\   |  |_)  |
                             \\   \\    |  |    /  /_\\  \\  |      /
                        .-----)   |   |  |   /  _____  \\ |  |\\  \\-------.
                        |________/    |__|  /__/     \\__\\| _| `.________|
                         ____    __    ____  ___     .______    ________.
                         \\   \\  /  \\  /   / /   \\    |   _  \\  /        |
                          \\   \\/    \\/   / /  ^  \\   |  |_)  ||   (-----`
                           \\            / /  /_\\  \\  |      /  \\   \\
                            \\    /\\    / /  _____  \\ |  |\\  \\---)   |
                             \\__/  \\__/ /__/     \\__\\|__| `._______/

                        ------------------------------------------------
                        """);
                System.out.printf("Star War is a %s %s of %s versus evil in a %s far far away.%n", adjective1, noun1,
                        adjective2, noun2);
                System.out.println("There are " + adjective3 + " battles between " + adjective4 + " " + noun3 + " in "
                        + adjective5 + " space and " + adjective6 + " duels with " + noun4 + " called " + adjective7 + " sabers.");
                System.out.printf("%s called \"droids\" are helpers and %s" +
                        " to the heroes.%n", noun5.toUpperCase(), noun6);
                System.out.printf("A %s power called The %s %ss people to do %s " +
                        " things, like %s %s.",adjective8, noun7.toUpperCase(),verb1,adjective9,verb2,noun8);
                System.out.printf("The Jedi %s use The Force for %s side and the Sith %s it for the %s side.%n",
                        noun9,adjective10, verb3, adjective11);

            }
            else if(begin == 2){
                System.out.println("Nice! You chose Pizza, let's do it!");
            }

        }

    }
}
