/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

public class ConsoleSales extends Consoles {

    // Constructor passes the values to the Consoles superclass
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Prints the console type, store name and total sales
    @Override
    public void printReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*******************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
