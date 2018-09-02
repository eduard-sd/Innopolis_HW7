package ru.sayakhov.VM2;

import ru.sayakhov.DrinkType;

public class SecondVendingMachine {
    private static final int VENDING_SIZE = 5;
    private Drink[] drinks = new Drink[5];
    private DrinkType type;

    public static int getVendingSize() {
        return VENDING_SIZE;
    }


    public Drink[] getDrinks() {
        // удалить напиток из данной ячейки
        return drinks;
    }//получить список всех напитков
    public void setDrinks(Drink[] drinks) {
        if(drinks.length > 5){
            System.out.println("В машине всего 5 мест");
        }else{this.drinks = drinks;}
    } //сразу все напитки загрузить


    public DrinkType getType() {
        return type;
    }
    public void setType(DrinkType type) {
        this.type = type;
    }

    //аргументы обьекты
    public void addDrink(Drink drink, int index){
        if (drinks[index] != null){
            System.out.println("В данной ячейке  нет места");
        }
        drinks[index] = drink; // загружаем по одному
    }
    public Drink getDrink(int index) {
        if (drinks[index] == null){
            System.out.println("В данной ячейке пусто");
        }
        return drinks[index];
    }
    // remoove drinkks с какой ячейки удалить  напиток
    // в  метое add проверить размер и индекс
    // создать пару машин разной логинкой
}
