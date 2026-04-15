package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.println("What is your phone's serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your phone model: ");
        String model = scanner.next();
        scanner.nextLine();

        System.out.println("Who is your phone carrier: ");
        String carrier = scanner.next();
        scanner.nextLine();

        System.out.println("What is your phone number: ");
        String phoneNumber = scanner.next();
        scanner.nextLine();

        System.out.println();
        String owner = scanner.next();
        scanner.nextLine();

        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";





    }
}
