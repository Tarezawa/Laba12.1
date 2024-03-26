package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private int salary;

    public Tester(String name) {
        this(name, "", 0, "", 0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "", 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "", 0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата: $" + salary);
    }

    public void printInfo(String position) {
        System.out.println("Должность: " + position + ", Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата: $" + salary);
    }

    public void printInfo(String position, int newSalary) {
        System.out.println("Должность: " + position + ", Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Уровень английского: " + englishLevel + ", Новая зарплата: $" + newSalary);
    }
}
