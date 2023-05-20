package org.example;

import org.example.inputOutputStreams.InOut;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    private String name;
    private Scanner scanner;
    private InOut inOut = new InOut();

    public static void main(String[] args) {
        Main program = new Main();
        program.initialise();
        program.runProgram();
    }

    public void initialise() {
        initialise(System.in);
    }

    public void initialise(InputStream inputStream) {
        inOut.initialise(inputStream);
    }

    public void runProgram() {
        inOut.print("Welcome to B-Cal");
        setName();
    }

    public static void print(String stmt) {
        System.out.println(stmt);
    }

    public void setName() {
        name = inOut.prompt("What is your name? ");
//        print("What is your name? ");
//        name = scanner.nextLine();

    }

    public String getName() {
        return name;
    }
}
