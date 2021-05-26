package com.HelloNepal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Finding the greatest number among three inputs
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put your first digits");
        double first = keyboard.nextDouble();
        System.out.println("Please put your second digit");
        double second = keyboard.nextDouble();
        System.out.println("Please put your third digit");
        double third = keyboard.nextDouble();
        if (first > second && first > third) {
            System.out.println("Largest number is: " + first);
        } else if (second > third) {
            System.out.println("Largest number is: " + second);
        } else {
            System.out.println("Largest number is: " + third);
        }

    }
}
