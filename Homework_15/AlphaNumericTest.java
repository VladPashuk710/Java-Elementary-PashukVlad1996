package Homework_15;

import homework4.Alphanumeric;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlphaNumericTest {

    String alphabet = "";
    String ALPHA = "";
    String NUMERIC = "";
    String ALPFANUMERIC = "";

    private Alphanumeric randomString;

    @Before
    public void setUp() {
        randomString = new Alphanumeric();
    }

    @Test
    public void TestNextInt() {

        assertEquals("Incorrect record in strings ", "3", randomString.nextInt(alphabet.length()));
    }

    @Test
    public void testRandomAlphaStringLength() {
        String randomString = Alphanumeric.randomString(Alphanumeric.StringType.ALPHA,10);
        assertEquals(10, randomString.length());
    }

    @Test
    public void testRandomAlphaStringContent() {
        String randomString = Alphanumeric.randomString(Alphanumeric.StringType.ALPHA,10);
        assertTrue(randomString.matches("[a-zA-Z]*"));
    }

    @Test
    public void testRandomNumericStringLength() {
        String randomString = Alphanumeric.randomString(Alphanumeric.StringType.NUMERIC,10);
        assertEquals(10, randomString.length());
    }

    @Test
    public void testRandomNumericStringContent() {
        String randomString = Alphanumeric.randomString(Alphanumeric.StringType.NUMERIC,10);
        assertTrue(randomString.matches("[0-9]*"));
    }

    @Test
    public void testRandomAlphaNumericLength() {
        String randomString = Alphanumeric.randomString(Alphanumeric.StringType.ALPFANUMERIC,10);
        assertEquals(10, randomString.length());
    }

    @Test
    public void testRandomAlphaNumericContent() {
        String randomString = Alphanumeric.randomString(Alphanumeric.StringType.ALPFANUMERIC,10);
        assertTrue(randomString.matches("[a-zA-Z0-9]*"));
    }

}
