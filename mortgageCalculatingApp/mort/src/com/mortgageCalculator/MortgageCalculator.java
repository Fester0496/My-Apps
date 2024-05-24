package com.mortgageCalculator;

public class MortgageCalculator {
    private int principal;
    private float rateYear;
    private byte years;

    public MortgageCalculator(int principal, float rateYear, byte years) {
        this.principal = principal;
        this.rateYear = rateYear;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float rateMonth = rateYear / Main.MONTHS_IN_YEAR / Main.PERCENT;
        short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + rateMonth, numberOfPayments) - Math.pow(1 + rateMonth, numberOfPaymentsMade))
                / (Math.pow(1 + rateMonth, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {

        float rateMonth = rateYear / Main.MONTHS_IN_YEAR / Main.PERCENT;
        short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

        double mortgage = principal
                * (rateMonth * Math.pow(1 + rateMonth, numberOfPayments))
                / (Math.pow(1 + rateMonth, numberOfPayments) - 1);

        return mortgage;
    }
}
