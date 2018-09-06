package ru.sayakhov.VM2;

import ru.sayakhov.Currency;
import ru.sayakhov.DrinkType;

public class Drink {
    private static int counter;
    private int price;
    private String name;
    private Currency moneyCurr;
    private DrinkType type;

    public Drink(int price, String name, Currency moneyCurr, DrinkType type) {
        this.price = price;
        this.name = name;
        this.moneyCurr = moneyCurr;
        this.type = type;
        counter++;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getMoneyCurr() {
        return moneyCurr;
    }

    public void setMoneyCurr(Currency moneyCurr) {
        this.moneyCurr = moneyCurr;
    }

    public static int getCounter() {
        return counter;
    }

    public DrinkType getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
