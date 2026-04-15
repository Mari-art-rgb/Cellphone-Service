package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.println("What is your phone's serial number? ");
        int serialNumber = scanner.nextInt();

        System.out.println("What is your phone model: ");
        String model = scanner.next();

        System.out.println("Who is your phone carrier: ");
        String carrier = scanner.next();

        System.out.println("What is your phone number: ");
        String phoneNumber = scanner.next();

        System.out.println();
        String owner = scanner.next();

        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";





    }
}
