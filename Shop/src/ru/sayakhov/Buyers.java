package ru.sayakhov;

public class Buyers extends Person {
    private double money;

    public Buyers(String name, Sex sex, double money) {
        super(name, sex);
        this.money = money;
    }

    public Buyers(String name, int age, Sex sex, double money) {
        super(name, age, sex);
        this.money = money;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Buyers{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", sex=" + sex +
                '}';
    }
}
