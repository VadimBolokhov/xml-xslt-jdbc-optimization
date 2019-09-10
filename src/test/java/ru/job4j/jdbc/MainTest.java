package ru.job4j.jdbc;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Main class.
 * @author Vadim Bolokhov
 */
public class MainTest {

    @Test
    public void whenRunApplicationWithArgumentFourThenReturnTen() throws Exception {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Main.main(new String[] {String.valueOf(4)});
        int result = Integer.parseInt(new String(out.toByteArray()).trim());
        assertThat(result, is(10));
        System.setOut(stdout);
    }
}
