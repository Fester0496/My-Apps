package com.mortgageCalculator;
/** A program that prints the monthly mortgage payment and a schedule for the remaining balance */

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

        public static void main(String[] args) {
        int principal = (int) Console.readNumber("Please insert the total loan amount (Principal): ", 1000, 1_000_000);
        float rateYear = (float) Console.readNumber("Please insert the Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Please insert the duration in Years: ", 1, 30);

            MortgageReport.printMortgage(principal, rateYear, years);
            MortgageReport.printPaymentSchedule(years, principal, rateYear);

        }


}