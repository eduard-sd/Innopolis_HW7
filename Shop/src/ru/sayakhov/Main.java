package ru.sayakhov;


public class Main {

    public static void main(String[] args) {

        Buyers viktor = new Buyers("Viktor",46,Sex.MALE,4000);
        Buyers kate = new Buyers("Ekaterina",25,Sex.FEMALE,1000);
        Buyers alex = new Buyers("Alexandr", 15,Sex.MALE,500);
        Buyers nastya = new Buyers("Nastya",50,Sex.FEMALE,9000);

        Stuff petia = new Stuff("Peter",40,Sex.MALE,30000);
        Stuff denis = new Stuff("Denis",20, Sex.MALE,20000);
        Stuff vika = new Stuff("Viktoria",26,Sex.FEMALE, 25000);
        Stuff olga = new Stuff("Olga",46,Sex.FEMALE, 55000);

        Product whiteBread = new Product("White bread",120,Station.BREAD);
        Product chikenGril = new Product("Chiken Grill", 200,Station.MEET);
        Product beefMeet = new Product("Beef Meet", 300,Station.MEET);
        Product pooding = new Product("Pooding", 50, Station.MILK);

        whiteBread.setStationStuff(petia);
        chikenGril.setStationStuff(petia);
        beefMeet.setStationStuff(denis);
        pooding.setStationStuff(vika);

        Shop magnit = new Shop("Magnit",300000);
        magnit.setPrincipal(olga);
        magnit.setStuffList(new Stuff[]{petia,denis,vika,olga});
        magnit.setBuyersList(new Buyers[]{viktor,kate,alex,nastya});

        System.out.println(magnit);
    }
}
