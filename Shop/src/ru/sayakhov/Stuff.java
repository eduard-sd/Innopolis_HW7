package ru.sayakhov;

public class Stuff extends Person {
    private double salary;

    public Stuff() {
    }

    public Stuff(double salary) {
        this.salary = salary;
    }

    public Stuff(String name, Sex sex, double salary) {
        super(name, sex);
        this.salary = salary;
    }

    public Stuff(String name, int age, Sex sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", sex=" + sex +
                '}';
    }
}
