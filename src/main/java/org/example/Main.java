package org.example;

import com.google.gson.Gson;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();

        System.out.print("Введіть прізвище: ");
        String lastName = scanner.nextLine();

        System.out.print("Введіть ім'я: ");
        String firstName = scanner.nextLine();

        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        Person original = new Person(lastName, firstName, age);

        String json = gson.toJson(original);
        System.out.println("JSON: " + json);

        Person fromJson = gson.fromJson(json, Person.class);

        System.out.println("Об'єкти рівні? " + original.equals(fromJson));
    }
}
