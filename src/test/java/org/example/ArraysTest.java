package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    public void testPrintArray() {
        Arrays arrays = new Arrays();
        String[] testArray = {"test1", "test2", "test3"};
        String expectedOutput = "test1, test2, test3";

        // Redirect standard output to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        arrays.printArray(testArray);
        assertEquals(expectedOutput, outputStream.toString().trim());

        // Reset standard output
        System.setOut(System.out);
    }

}
