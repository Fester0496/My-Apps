package com.mortgageCalculator;

import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principal, float rateYear, byte years) {
        var calculator = new MortgageCalculator(principal, rateYear, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Your monthly payments will be: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(byte years, int principal, float rateYear) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            var calculator = new MortgageCalculator(principal, rateYear, years);
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
