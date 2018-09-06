import ru.sayakhov.*;

import ru.sayakhov.VM2.Drink;
import ru.sayakhov.VM2.SecondVendingMachine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SecondVendingMachine svm = new SecondVendingMachine();

        Drink tea = new Drink(50, "TEA", Currency.USD, DrinkType.HOT);
        Drink coffee = new Drink(40, "Coffee", Currency.EURO, DrinkType.HOT);
        Drink milk = new Drink(30, "Milk", Currency.USD, DrinkType.COLD);
        Drink water = new Drink(40, "Water", Currency.RUB, DrinkType.COLD);
        Drink greenTea = new Drink(1, "Green-Tea", Currency.EURO, DrinkType.HOT);
        Drink chocolate = new Drink(4, "Chocolate", Currency.DINNAR, DrinkType.HOT);

        System.out.println("Количество напитков "+chocolate.getCounter()); // кол напитков

        Drink[] drinkArr = new Drink[]{tea, coffee, milk, water, greenTea, chocolate}; //массив таких обьектов
        svm.setDrinks(drinkArr); // положили в машину
        System.out.println(Arrays.toString(svm.getDrinks())); // [null, null, null, null, null]

        Drink[] drinkArr2 = new Drink[]{tea, coffee, milk, water, greenTea}; //массив таких обьектов
        svm.setDrinks(drinkArr2); // положили в машину
        System.out.println("Повторно: " + Arrays.toString(svm.getDrinks())); // Повторно: [TEA, Coffee, Milk, Water, Green-Tea]
		System.out.println();
		System.out.println();
		System.out.println();

        System.out.println("Вейдинговая машина 1.0");
        System.out.println("Меню: " + "\nполучить список горячих напиток - 1" + "\nполучить список холодный напиток - 2" + "\nвыход - 3");

        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number != 3) {
            System.out.print("\nВведите число от 1 до 3 :  ");
            while (!sc.hasNextInt()) { //проверка не равно числу
                System.out.print("Пожалуйста введите только целые числа, без букв и знаков препинания.\nВедите число от 1 до 3 :");
                sc.next();
            }
            number = sc.nextInt();
            if (number == 1) {
                svm.setDrinksHot();
                System.out.println("\nГорячие напитки: " + "\n" + Arrays.toString(svm.getDrinksHot())+"\n");
                System.out.println("Введите название напитка: ");
                //Scanner scc = new Scanner(System.in);
                String userChoice = sc.next();
                if (svm.isDrinkExist(userChoice)) {
                    number = 3;
                }
            }else if(number == 2) {
                svm.setDrinksCold();
                System.out.println("\nХолодные напитки: " + "\n" + Arrays.toString(svm.getDrinksCold())+"\n");
                System.out.println("Введите название напитка: ");
                //Scanner scc = new Scanner(System.in);
                String userChoice = sc.next();
                if (svm.isDrinkExist(userChoice)) {
                    number = 3;
                }
            }else if(number == 3) {
                break;
            }else{
                System.out.println("Вы ввели не действующую кнопку");
                continue;
            }
        }
    }
}