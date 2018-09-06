package ru.sayakhov.VM2;

import ru.sayakhov.DrinkType;

import java.util.Arrays;

public class SecondVendingMachine {
    private static final int VENDING_SIZE = 5;
    private Drink[] drinks = new Drink[VENDING_SIZE];
    private Drink[] drinksHot = new Drink[VENDING_SIZE];
    private Drink[] drinksCold = new Drink[VENDING_SIZE];

    public static int getVendingSize() {
        return VENDING_SIZE;
    }


    public Drink[] getDrinks() {
        // удалить напиток из данной ячейки
        return drinks;
    }//получить список всех напитков

    public void setDrinks(Drink[] drinks) {
        if(drinks.length > VENDING_SIZE){
            System.out.println("В машине всего 5 мест");
        }else{this.drinks = drinks;}
    } //сразу все напитки загрузить
    //продумать тип напитка горячий хол

    //аргументы обьекты
    public void addDrink(Drink drink, int index){
        if (drinks[index] != null){
            System.out.println("В данной ячейке  нет места");
        }
        drinks[index] = drink; // загружаем по одному
    }
    public Drink getDrink(int index) {
        if (drinks[index] == null) {
            System.out.println("В данной ячейке пусто");
        }
        return drinks[index];
    }
    public void removeDrink(int index){
        drinks[index] = null;
    }

    public Boolean isDrinkExist (String userChoice){
        Boolean isDrinkFound = false;
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i].getName().equalsIgnoreCase(userChoice)) {
                System.out.print("Пожалуйста ваш напиток:");
                System.out.println(drinks[i].getName());
                removeDrink(i);
                System.out.println("Напитки в машине: " + Arrays.toString(drinks));
                System.out.println("Спасибо за покупку!");
                isDrinkFound = true;
                break;
            }
        }
        if (!isDrinkFound) {
            System.out.println("Такого напитка нет.");
        }
        return isDrinkFound;
    }

    // remoove drinkks с какой ячейки удалить  напиток
    // в  метое add проверить размер и индекс
    // создать пару машин разной логинкой


    public Drink[] getDrinksHot() {
        return drinksHot;
    }

    public void setDrinksHot() {
        int drinkLen = 0;
        for (Drink i: drinks) {
            if (i.getType() == DrinkType.HOT){
                this.drinksHot[drinkLen] = i;
                drinkLen += 1;
            }
        }
    }

    public Drink[] getDrinksCold() {
        return drinksCold;
    }

    public void setDrinksCold() {
        int drinkLen = 0;
        for (Drink i: drinks) {
            if (i.getType() == DrinkType.COLD){
                this.drinksCold[drinkLen] = i;
                drinkLen += 1;
            }
        }
    }
}
