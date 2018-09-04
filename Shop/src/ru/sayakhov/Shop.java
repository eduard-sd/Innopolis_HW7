package ru.sayakhov;

import java.util.Arrays;

public class Shop{
    private String name;
    private double departmentCash;
    private Stuff principal;
    private Stuff[] stuffList;
    private Buyers[] buyersList;


    public Shop() {
    }

    public Shop(double departmentCash) {
        this.departmentCash = departmentCash;
    }

    public Shop(String name, double departmentCash) {
        this.name = name;
        this.departmentCash = departmentCash;
    }


    public double getDepartmentCash() {
        return departmentCash;
    }

    public void setDepartmentCash(double departmentCash) {
        this.departmentCash = departmentCash;
    }

    public Stuff getPrincipal() {
        return principal;
    }

    public void setPrincipal(Stuff principal) {
        this.principal = principal;
    }

    public Stuff[] getStuffList() {
        return stuffList;
    }

    public void setStuffList(Stuff[] stuffList) {
        this.stuffList = stuffList;
    }

    public Buyers[] getBuyersList() {
        return buyersList;
    }

    public void setBuyersList(Buyers[] buyersList) {
        this.buyersList = buyersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", departmentCash=" + departmentCash +
                ", principal=" + principal +
                ", stuffList=" + Arrays.toString(stuffList) +
                ", buyersList=" + Arrays.toString(buyersList) +
                '}';
    }
}
