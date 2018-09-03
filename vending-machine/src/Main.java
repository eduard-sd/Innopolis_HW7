import ru.sayakhov.*;
/*import ru.sayakhov.VM1.VendingMachine;*/
import ru.sayakhov.VM2.Drink;
import ru.sayakhov.VM2.SecondVendingMachine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //     public static ColdDrinks[]  drinksNew = new ColdDrinks[4];
    public static void main(String[] args) {
        /*        VendingMachine vm = new VendingMachine();*/
/*        ColdDrinks fanta = new ColdDrinks("Fanta",5.5, Currency.Rub); // могу ли я вместо значений пердать input пользователя присвоенного к переменной
        ColdDrinks coca = new ColdDrinks("Coca-cola",4.7, Currency.Dinnar);
        ColdDrinks sprite = new ColdDrinks("Sprite",3.2, Currency.Usd);
        ColdDrinks water = new ColdDrinks("Water",1.1, Currency.Rub);
//        ColdDrinks.setDrinksNew(fanta,coca,sprite,water); //через метод сет пробую передать обьекты в массив

        drinksNew[0] = fanta;
        drinksNew[1] = coca;
        drinksNew[2] = sprite;
        drinksNew[3] = water;
        for (int i = 0; i<4; i++){
            System.out.println(drinksNew[i].drinkName +" "+drinksNew[i].price+" "+drinksNew[i].moneyCurrency);
        }*/

/*        vm.addMoney(200);
        vm.giveMeADrink(Drinks.COLA);
        vm.giveMeADrink(Drinks.FANTA);
        vm.giveMeADrink(Drinks.SPRITE);*/

        /*VendingMachineForTea vmft = new VendingMachineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(1);*/

        SecondVendingMachine svm = new SecondVendingMachine();
        svm.setType(DrinkType.HOT);
        Drink tea = new Drink(50, "TEA", Currency.USD, DrinkType.HOT);
        Drink coffee = new Drink(40, "Coffee", Currency.EURO, DrinkType.HOT);
        Drink milk = new Drink(30, "Milk", Currency.USD, DrinkType.HOT);
        Drink water = new Drink(40, "Water", Currency.RUB, DrinkType.HOT);
        Drink greenTea = new Drink(1, "Green-Tea", Currency.EURO, DrinkType.HOT);
        Drink chocolate = new Drink(4, "Chocolate", Currency.DINNAR, DrinkType.HOT);

        Drink[] drinkArr = new Drink[]{tea, coffee, milk, water, greenTea, chocolate}; //массив таких обьектов
        svm.setDrinks(drinkArr); // положили в машину
        System.out.println(Arrays.toString(svm.getDrinks())); // [null, null, null, null, null]

        Drink[] drinkArr2 = new Drink[]{tea, coffee, milk, water, greenTea}; //массив таких обьектов
        svm.setDrinks(drinkArr2); // положили в машину
        System.out.println("Повторно: " + Arrays.toString(svm.getDrinks())); // Повторно: [TEA, Coffee, Milk, Water, Green-Tea]

        Drink[] drinkArr3 = new Drink[]{tea, coffee, milk, water}; //массив таких обьектов
        svm.setDrinks(drinkArr3); // положили в машину
        System.out.println("Повторно массив 2: " + Arrays.toString(svm.getDrinks())); // Повторно: [TEA, Coffee, Milk, Water, Green-Tea]

        System.out.println(svm.getDrink(1));
        System.out.println(Arrays.toString(svm.getDrinks()));


        System.out.println("Вейдинговая машина 1.0");
        System.out.println("Меню: " + "\nполучить список горячих напиток - 1" + "\nполучить список холодный напиток - 2" + "\nвыход - 3");

        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number != 3) {
            System.out.print("Введите число ");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) { //проверка не равно числу
                System.out.println("Пожалуйста введите только целые числа, без букв и знаков препинания.");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Горячие напитки: " + "\n" + Arrays.toString(svm.getDrinks())); // Повторно: [TEA, Coffee, Milk, Water, Green-Tea]
                System.out.println("Введите название напитка");
                Scanner scc = new Scanner(System.in);
                String userChoice = scc.nextLine();

                for (Drink s : svm.getDrinks()) {
                    if (s.getName().equals(userChoice)) {
                        // как узнать из какого массива выполилось условие if
                        System.out.println("ваш напиток");
                        System.out.println(s.getName());
                    }
                }/*else if(number == 2) {
                continue;
            }else{
                System.out.println("Вы ввели не действующую кнопку");
                continue;
            }*/
            }
        }
    }
}