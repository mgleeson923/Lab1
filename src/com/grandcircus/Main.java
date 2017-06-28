package com.grandcircus;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

    /* Explanation of Program Purpose// */
        System.out.println("Welcome to the Grand Circus' Room Detail Generator!");

	/* Scanner for user Input// */
        Scanner scnr = new Scanner(System.in);

    /* Formatting to limit results to one decimal place*/
        DecimalFormat df = new DecimalFormat("#.#");

	/* Variables to handle decimals for user input// */
        double length = 0;
        double width = 0;
        double height = 0;


		/* Repeating process taking User inputted Length, Width, and Height, and calculating Area, Perimeter, & Volume// */
        String repeat = null;
        do {
            System.out.print("Enter Length: ");
            while (!scnr.hasNextDouble()) {
                System.out.println("That's not a number!");
                scnr.next();
            }
            length = scnr.nextDouble();

            System.out.print("Enter Width: ");
            while (!scnr.hasNextDouble()) {
                System.out.println("That's not a number!");
                scnr.next();
            }
            width = scnr.nextDouble();

            System.out.print("Enter Height: ");
            while (!scnr.hasNextDouble()) {
                System.out.println("That's not a number!");
                scnr.next();
            }
            height = scnr.nextDouble();

            System.out.println("Area: " + (df.format(length * width)));

            System.out.println("Perimeter: " + (df.format((length * 2) + (width * 2))));

            System.out.println("Volume: " + (df.format(length * width * height)));

            System.out.println("Continue? Y/N?: ");
            repeat = scnr.next();

		/* As long as User does not input N or n, Program will repeat// */
        } while (!repeat.equals("N") && !repeat.equals("n"));

		/* text prompt signifying end of application if user types N or n */
        System.out.println("Thanks for playing! Goodbye!");

    }
}
