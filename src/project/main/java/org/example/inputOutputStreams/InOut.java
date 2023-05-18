package org.example.inputOutputStreams;

import java.io.InputStream;
import java.util.Scanner;

public class InOut {
    private Scanner scanner;
    public void initialise() {
        initialise(System.in);
    }

    public void initialise(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public String prompt(String text) {
        print(text);
        return scanner.nextLine();
    }

    public void print(String stmt) {
        System.out.println(stmt);
    }


}
