// Mason Orton 
// CS1400
// 9/13/23
// Assignment Number 2

import java.util.Scanner;

public class TaskA {

    public static void main (String[]args) {

        // Part A

        // butterG = 125, butterOZ = 4
        // sugarG = 55, sugarOZ = 2
        // flourG = 180, flourOZ = 6
        double cookies;
        double butterG = 125;
        double butterOZ = 4;
        double sugarG = 55;
        double sugarOZ = 2;
        double flourG = 180;
        double flourOZ = 6;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many cookies would you like to make?");
        cookies = keyboard.nextDouble();

        cookies /= 24;

        System.out.println("You need " + butterG/cookies + " grams or " + butterOZ/cookies + " ounces of butter");
        System.out.println("You need " + sugarG/cookies + " grams or " + sugarOZ/cookies + " ounces of sugar");
        System.out.println("You need " + flourG/cookies + " grams or " + flourOZ/cookies + " ounces of flour");

        keyboard.close();
    }
}