package ru.sayakhov;

public enum Drinks {
    FANTA("Fanta", 2.3,"USD"), COLA("Coca-cola", 5.5,"RUB"), SPRITE("Sprite",10,"DINARS"), WATER("Water", 1.1,"RUB");

    private String drinkTitle;
    private double drinkPrice;
    //public String drinkCurrency;
    private Currency drinkCurrency;

    Drinks(String drinkTitle, double drinkPrice, /*String drinkCurrency*/ String drinkCurrency){
        this.drinkTitle = drinkTitle;
        this.drinkPrice = drinkPrice;
        //this.drinkCurrency = drinkCurrency;
        this.drinkCurrency = Currency.valueOf(drinkCurrency);
    }

    public String getDrinkTitle() {
        return drinkTitle;
    }

    public void setDrinkTitle(String drinkTitle) {
        this.drinkTitle = drinkTitle;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public Currency getDrinkCurrency() {
        return drinkCurrency;
    }

    public void setDrinkCurrency(Currency drinkCurrency) {
        this.drinkCurrency = drinkCurrency;
    }
}
