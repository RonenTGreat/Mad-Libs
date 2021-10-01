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

                continue;
            }

        }

    }
}
