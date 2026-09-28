/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menu for selecting the console type
        System.out.println("Select the console type");
        System.out.println(" 1) PS5");
        System.out.println(" 2) XBOX");
        System.out.println(" 3) SWITCH");
        System.out.println();

        int choice = input.nextInt();
        input.nextLine();   // clears the leftover newline

        // Converts the menu choice into the console type
        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid selection.");
                input.close();
                return;
        }

        // Captures the store name and total sales
        System.out.print("Enter the store: ");
        String store = input.nextLine();

        System.out.print("Enter the total sales of " + consoleType
                + " consoles for " + store + ":");
        int totalSales = input.nextInt();

        // Instantiates ConsoleSales and prints the report
        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();

        input.close();
    }
}
