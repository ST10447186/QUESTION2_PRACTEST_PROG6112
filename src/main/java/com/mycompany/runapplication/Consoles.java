/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

public abstract class Consoles implements IConsoles {

    // Instance variables
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor accepting the console type, store name and total sales
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Returns the console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Returns the store name
    @Override
    public String getStore() {
        return store;
    }

    // Returns the total amount of sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Subclasses must provide their own report
    public abstract void printReport();
}
