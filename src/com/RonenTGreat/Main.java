package com.RonenTGreat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int begin;
        Scanner keyboard = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Welcome to Mad Libs please select any of the mad libs to start");
                System.out.println("0: Quit");
                System.out.println("1: STAR WARS");
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
                            " to the heroes.%n", noun5, noun6);
                    System.out.printf("A %s power called The %s %ss people to do %s " +
                            " things, like %s %s.",adjective8, noun7,verb1,adjective9,verb2,noun8);
                    System.out.printf("The Jedi %s use The Force for %s side and the Sith %s it for the %s side.%n",
                            noun9,adjective10, verb3, adjective11);

                }
                else if(begin == 2){
                    System.out.println("Nice! You chose Pizza, let's do it!");
                    System.out.println("Please enter the following inputs.");
                    System.out.print("Enter an adjective: ");
                    String adjective1 = keyboard.next();
                    System.out.print("Enter a nationality: ");
                    String nationality = keyboard.next();
                    System.out.print("Enter a person's name: ");
                    String person = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun1 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective2 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun2 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective3 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective4 = keyboard.next();
                    System.out.print("Enter a plural noun: ");
                    String noun3 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun4 = keyboard.next();
                    System.out.print("Enter a number: ");
                    String number1 = keyboard.next();
                    System.out.print("Enter a shape: ");
                    String shape = keyboard.next();
                    System.out.print("Enter a food: ");
                    String food1 = keyboard.next();
                    System.out.print("Enter a food: ");
                    String food2 = keyboard.next();
                    System.out.print("Enter a number: ");
                    String number2 = keyboard.next();

                    System.out.println("-------------------------------------------------");
                    System.out.println("""
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣶⣶⣦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣷⣤⠀⠈⠙⢿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⠆⠰⠶⠀⠘⢿⣿⣿⣿⣿⣿⣆⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⠏⠀⢀⣠⣤⣤⣀⠙⣿⣿⣿⣿⣿⣷⡀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⢠⠋⢈⣉⠉⣡⣤⢰⣿⣿⣿⣿⣿⣷⡈⢿⣿⣿⣿⣿⣷⡀
                        ⠀⠀⠀⠀⠀⠀⠀⡴⢡⣾⣿⣿⣷⠋⠁⣿⣿⣿⣿⣿⣿⣿⠃⠀⡻⣿⣿⣿⣿⡇
                        ⠀⠀⠀⠀⠀⢀⠜⠁⠸⣿⣿⣿⠟⠀⠀⠘⠿⣿⣿⣿⡿⠋⠰⠖⠱⣽⠟⠋⠉⡇
                        ⠀⠀⠀⠀⡰⠉⠖⣀⠀⠀⢁⣀⠀⣴⣶⣦⠀⢴⡆⠀⠀⢀⣀⣀⣉⡽⠷⠶⠋⠀
                        ⠀⠀⠀⡰⢡⣾⣿⣿⣿⡄⠛⠋⠘⣿⣿⡿⠀⠀⣐⣲⣤⣯⠞⠉⠁⠀⠀⠀⠀⠀
                        ⠀⢀⠔⠁⣿⣿⣿⣿⣿⡟⠀⠀⠀⢀⣄⣀⡞⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⡜⠀⠀⠻⣿⣿⠿⣻⣥⣀⡀⢠⡟⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⢰⠁⠀⡤⠖⠺⢶⡾⠃⠀⠈⠙⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠈⠓⠾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""");

                    System.out.printf("""
                                Pizza was invented by a %s %s chef named %s.
                                To make a pizza, you need to take a lump of %s, and make a thin, round %s %s.
                                Then you cover it with %s sauce, %s  cheese, and fresh  chopped %s.
                                Next you have to bake it in a very hot %s.
                                When it is done, cut it into %s %s.
                                Some kids like %s pizza the best, but my favourite is the %s pizza.\040
                                If I could, I  would eat pizza %s times a day!
                                """
                            ,adjective1, nationality, person, noun1, adjective2, noun2, adjective3, adjective4, noun3, noun4,
                            number1, shape, food1, food2, number2);


                }
                else if(begin == 3){
                    System.out.println("WOW! Spooky, you are a daredevil!");
                    System.out.println("Please enter the following inputs.");
                    System.out.print("Enter a noun: ");
                    String noun1 = keyboard.next();
                    System.out.print("Enter an adverb: ");
                    String adverb1 = keyboard.next();
                    System.out.print("Enter a lastname: ");
                    String noun2 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective1 = keyboard.next();
                    System.out.print("Enter a number: ");
                    String noun3 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective2 = keyboard.next();
                    System.out.print("Enter a plural noun: ");
                    String noun4 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective3 = keyboard.next();
                    System.out.print("Enter a plural noun: ");
                    String noun5 = keyboard.next();
                    System.out.print("Enter a food: ");
                    String noun6 = keyboard.next();
                    System.out.print("Enter a firstname: ");
                    String noun7 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb1 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb2 = keyboard.next();
                    System.out.print("Enter an adjective(emotion): ");
                    String adjective4 = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb3 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective5 = keyboard.next();
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("""
                                                                      ,           ^'^  _
                                                                      )               (_) ^'^
                                 _/\\_                    .---------. ((        ^'^
                                 (('>                    )`'`'`'`'`( ||                 ^'^
                            _    /^|                    /`'`'`'`'`'`\\||           ^'^
                            =>--/__|m---               /`'`'`'`'`'`'`\\|
                                 ^^           ,,,,,,, /`'`'`'`'`'`'`'`\\      ,
                                             .-------.`|`````````````|`  .   )
                                            / .^. .^. \\|  ,^^, ,^^,  |  / \\ ((
                                           /  |_| |_|  \\  |__| |__|  | /,-,\\||
                                _         /_____________\\ |")| |  |  |/ |_| \\|
                               (")         |  __   __  |  '==' '=='  /_______\\     _
                              (' ')        | /  \\ /  \\ |   _______   |,^, ,^,|    (")
                               \\  \\        | |--| |--| |  ((--.--))  ||_| |_||   (' ')
                             _  ^^^ _      | |__| |("| |  ||  |  ||  |,-, ,-,|   /  /
                           ,' ',  ,' ',    |           |  ||  |  ||  ||_| |_||   ^^^
                        .,,|RIP|,.|RIP|,.,,'==========='==''=='==''=='=======',,....,,,,.,ldb""");

                    System.out.printf("""
                        There is a house on my %s that is %s haunted.
                        It's the old %s place that's been %s for %s years.
                        I can tell the house is %s because there are %s and %s %s
                        outside, and it smells like old %s.
                        I heard that a kid named %s %s inside and never %s back out.
                        My friends and I are %s to %s past the house because it's so %s.
                        """,noun1, adverb1, noun2, adjective1, noun3, adjective2, noun4, adjective3, noun5, noun6,
                            noun7, verb1, verb2, adjective4, verb3, adjective5);
                }
                else if(begin == 4){
                    System.out.println("And we have landed! Let's start astronaut");
                    System.out.println("Please enter the following inputs.");
                    System.out.print("Enter a number: ");
                    String noun1 = keyboard.next();
                    System.out.print("Enter a plural noun: ");
                    String noun2 = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb1 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective1 = keyboard.next();
                    System.out.print("Enter a number: ");
                    String noun3 = keyboard.next();
                    System.out.print("Enter a place: ");
                    String noun4 = keyboard.next();
                    System.out.print("Enter a firstname: ");
                    String noun5 = keyboard.next();
                    System.out.print("Enter a firstname: ");
                    String noun6 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb2 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun7 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb3 = keyboard.next();
                    System.out.print("Enter a number: ");
                    String noun8 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective2 = keyboard.next();
                    System.out.print("Enter an adjective: ");
                    String adjective3 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb4 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb5 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun9 = keyboard.next();
                    System.out.print("Enter a verb(-ed): ");
                    String verb6 = keyboard.next();
                    System.out.print("Enter a plural noun: ");
                    String noun10 = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb7 = keyboard.next();
                    System.out.print("Enter am adverb: ");
                    String adverb1 = keyboard.next();
                    System.out.print("Enter a number: ");
                    String noun11 = keyboard.next();
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("""
                         .--------------.
                                         .---'  o        .    `---.
                                      .-'    .    O  .         .   `-.
                                   .-'     @@@@@@       .             `-.
                                 .'@@   @@@@@@@@@@@       @@@@@@@   .    `.
                               .'@@@  @@@@@@@@@@@@@@     @@@@@@@@@         `.
                              /@@@  o @@@@@@@@@@@@@@     @@@@@@@@@     O     \\
                             /        @@@@@@@@@@@@@@  @   @@@@@@@@@ @@     .  \\
                            /@  o      @@@@@@@@@@@   .  @@  @@@@@@@@@@@     @@ \\
                           /@@@      .   @@@@@@ o       @  @@@@@@@@@@@@@ o @@@@ \\
                          /@@@@@                  @ .      @@@@@@@@@@@@@@  @@@@@ \\
                          |@@@@@    O    `.-./  .        .  @@@@@@@@@@@@@   @@@  |
                         / @@@@@        --`-'       o        @@@@@@@@@@@ @@@    . \\ \s
                         |@ @@@@ .  @  @    `    @            @@      . @@@@@@    |  \s
                         |   @@                         o    @@   .     @@@@@@    |   \s
                        -
                         |  .     @   @ @       o              @@   o   @@@@@@.   |    \s
                         \\     @    @       @       .-.       @@@@       @@@      /
                          |  @    @  @              `-'     . @@@@     .    .    |
                          \\ .  o       @  @@@@  .              @@  .           . /
                           \\      @@@    @@@@@@       .                   o     /
                            \\    @@@@@   @@\\@@    /        O          .        /
                             \\ o  @@@       \\ \\  /  __        .   .     .--.  /
                              \\      .     . \\.-.---                   `--'  /
                               `.             `-'      .                   .'
                                 `.    o     / | `           O     .     .'
                                   `-.      /  |        o             .-'
                                      `-.          .         .     .-'
                                         `---.        .       .---'
                                              `--------------'""");

                    System.out.printf("""
                                On July %s 1969, two American %s were the first to %s on the moon.
                                This %s trip took %s days to reach the moon from %s
                                As %s Armstrong and %s Aldrin %s onto the %s of the moon, Armstrong %s the famous words,
                                "That's %s %s step for a man, one %s leap for mankind."
                                Soon after, Aldrin %s onto the moon and together, they %s a U.S. %s on the surface.
                                They %s %s from the moon's surface to %s back to Earth and %s returned home %s days later.
                                """,
                            noun1, noun2, verb1, adjective1, noun3, noun4, noun5, noun6, verb2, noun7, verb3,
                            noun8, adjective2, adjective3, verb4, verb5, noun9, verb6, noun10, verb7, adverb1,noun11);
                }
                else if(begin == 5){
                    System.out.println("We are heading one!!!");
                    System.out.println("Please enter the following inputs.");
                    System.out.print("Enter a colour: ");
                    String colour = keyboard.next();
                    System.out.print("Enter a number: ");
                    String number = keyboard.next();
                    System.out.print("Enter a vehicle: ");
                    String vehicle = keyboard.next();
                    System.out.print("Enter a family member: ");
                    String familyMember1 = keyboard.next();
                    System.out.print("Enter a family member: ");
                    String familyMember2 = keyboard.next();
                    System.out.print("Enter a food: ");
                    String food = keyboard.next();
                    System.out.print("Enter a fruit(plural): ");
                    String fruits = keyboard.next();
                    System.out.print("Enter a beverage: ");
                    String beverages = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb1 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun1 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun2 = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb2 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun3 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun4 = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb3 = keyboard.next();
                    System.out.print("Enter a verb: ");
                    String verb4 = keyboard.next();
                    System.out.print("Enter a noun: ");
                    String noun5 = keyboard.next();
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("""
                             ____________________
                                             //|           |        \\
                                           //  |           |          \\
                              ___________//____|___________|__________()\\__________________
                            /__________________|_=_________|_=___________|_________________{}
                            [           ______ |           | .           | ==  ______      { }
                          __[__        /##  ##\\|           |             |    /##  ##\\    _{# }_
                         {_____)______|##    ##|___________|_____________|___|##    ##|__(______}
                                     /  ##__##                              /  ##__##        \\
                        ----------------------------------------------------------------------------""");
                    System.out.printf("""
                        My family is taking a trip to %s Beach, %s hours away.
                        We are riding in a %s with my %s and %s.
                        My parents packed a cooler with %s sandwiches, %s, and %s.
                        They always %s us to wear %s and a %s so we don't get sunburned.
                        During the drive, we will %s games like %s and "Count the %s."
                        I can't wait to get there so I can go %s in the ocean and %s along the beach and collect %s\040
                        I find in the sand."""
                            , colour, number, vehicle, familyMember1, familyMember2,
                            food, fruits, beverages, verb1, noun1, noun2, verb2, noun3, noun4, verb3, verb4, noun5);


                }
            }catch (InputMismatchException e){
                System.out.println("Please enter a number.");
                break;
            }

        }

    }
}
