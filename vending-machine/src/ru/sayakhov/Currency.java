package ru.sayakhov;

public enum Currency {
    RUB("RUB", 1), USD("USD", 68), EURO("EURO", 78), DINNAR("DINNAR", 2.5);

    private String currencyTitle;
    private double currencyPrice;

    Currency (String currencyTitle, double currencyPrice){
        this.currencyTitle = currencyTitle;
        this.currencyPrice = currencyPrice;
    }

    public String getCurrencyTitle() {
        return currencyTitle;
    }

    public void setCurrencyTitle(String currencyTitle) {
        this.currencyTitle = currencyTitle;
    }

    public double getCurrencyPrice() {
        return currencyPrice;
    }

    public void setCurrencyPrice(double currencyPrice) {
        this.currencyPrice = currencyPrice;
    }
}
