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

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void testPrint() {
        Main.print("Welcome to B-Cal");
        assertEquals("Welcome to B-Cal", outputStream.toString().trim());
    }

    private InputStream generateInputStream(String userInput) {
        byte[] inputStreamData = userInput.getBytes();
        return new ByteArrayInputStream(inputStreamData);
    }
}
