/*
package ru.sayakhov.VM1;
import ru.sayakhov.Currency;
import ru.sayakhov.Drinks;

public class VendingMachine extends ColdDrinks {
    private double money = 0;
    //private String[] drinks = {"Кока","фанта","спрайт","вода"}; // как передать в массив одного класса, обьектЫ другого класса?
                                                                // что получится, словарь ? как потом их читать ?

    public void addMoney(double money) {
        this.money = money;
    }
    public double getMoney() {
        return money;
    }

    public void giveMeADrink(Drinks drink){
        //double realp = realPrice(drink);
        if (money >= realPrice(drink)) {
            System.out.println("Возьмите ваш напиток: " + drink);
            money -= realPrice(drink);
            System.out.println("Возьмите сдачу: " + money);
        }else{
            System.out.println("Бесплатно не работаем!");
        }
    }

    protected double realPrice(Drinks drink){
        if (Currency.RUB.equals(drink.getDrinkCurrency()){

        }
        String u = String.valueOf(drink.drinkCurrency);
        if (u.equals("USD")){
            return drink.drinkPrice*Currency.USD.currencyPrice;
        }else if (u.equals(Currency.RUB.currencyTitle)){
            return drink.drinkPrice*Currency.RUB.currencyPrice;
        }else if (u.equals(Currency.DINNAR.currencyTitle)) {
            return drink.drinkPrice * Currency.DINNAR.currencyPrice;
        }
        return 0;
    }

}
*/
