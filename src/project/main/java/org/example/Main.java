package org.example;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    private String name;
    private Scanner scanner;

    public static void main(String[] args) {
        print("Welcome to B-Cal");
    }

    public void initialise() {
        initialise(System.in);
    }

    public void initialise(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public static void print(String stmt) {
        System.out.println(stmt);
    }

    public void setName() {
        print("What is your name? ");
        name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
