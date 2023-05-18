package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainClass {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        main = null;
        System.setOut(System.out);
    }

    @Test
    void testPrint() {
        Main.print("Welcome to B-Cal");
        assertEquals("Welcome to B-Cal\n", outputStream.toString());
    }

    @Test
    void testSetName() {
        main.initialise(generateInputStream("Simon"));
        main.setName();
        assertEquals("Simon", main.getName());
    }

    private InputStream generateInputStream(String userInput) {
        byte[] inputStreamData = userInput.getBytes();
        return new ByteArrayInputStream(inputStreamData);
    }
}
