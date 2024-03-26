package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Максим";
        System.out.println("Hello, " + name);

        Tester tester = new Tester("John", "Doe", 5, "Advanced", 5000);
        tester.printInfo();
        tester.printInfo("Senior");
        tester.printInfo("Lead", 7000);
        System.out.println("Hi I'm" + name);
        AnotherClass.staticMethod();
    }
}