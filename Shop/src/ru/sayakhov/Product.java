package ru.sayakhov;

import java.time.LocalDate;

public class Product {
    private String name;
    private int price;
    private LocalDate expirationDate; // срок годности
    private Station station;
    private Stuff stationStuff;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price, Station station) {
        this.name = name;
        this.price = price;
        this.station = station;
    }

    public Product(String name, int price, LocalDate expirationDate, Station station) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.station = station;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Stuff getStationStuff() {
        return stationStuff;
    }

    public void setStationStuff(Stuff stationStuff) {
        this.stationStuff = stationStuff;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                ", station=" + station +
                ", stationStuff=" + stationStuff +
                '}';
    }
}
