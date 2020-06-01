package Homework_16;

import homework4.Alphanumeric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphaNumericTest {

    String alphabet = "";
    String result = "";
    private Alphanumeric rand;

    @Before
    public void setUp() {
        rand = new Alphanumeric();
    }

    @Test
    public void TestNextInt() {
        assertEquals("Incorrect record in strings ", "3", rand.nextInt(alphabet.length()));
    }
}
