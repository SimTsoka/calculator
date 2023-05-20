package org.example.inputOutputStreams;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInOut {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private InOut inOut;

    @BeforeEach
    void setUp() {
        inOut = new InOut();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        inOut = null;
        System.setOut(System.out);
    }

    @Test
    void testPrint() {
        inOut.print("Welcome to B-Cal");
        assertEquals("Welcome to B-Cal\n", outputStream.toString());
    }

    @Test
    void testPrompt() {
        inOut.initialise(generateInputStream("Simon\n"));
        String actual = inOut.prompt("What is your name? ");
        String expected = "What is your name? \n";
        assertEquals("Simon",actual);
        assertEquals(expected, outputStream.toString());
    }

    private InputStream generateInputStream(String userInput) {
        byte[] inputStreamData = userInput.getBytes();
        return new ByteArrayInputStream(inputStreamData);
    }

    //TODO: Don't forget to remove duplicate tests in TestMainClass
}
