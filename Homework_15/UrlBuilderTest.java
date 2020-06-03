package Homework_15;

import Homework_10.MyUrlBuilder;
import org.hamcrest.core.StringEndsWith;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UrlBuilderTest {

    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String params;

    private MyUrlBuilder url;

    @Before
    public void setUp() {
        url = new MyUrlBuilder(protocol, domain, port, path, params);
    }

    @Test
    public void testIsEmpty() {

        assertEquals("Not found param", "1", protocol.isEmpty());
        assertEquals("Not found param", "2", port.isEmpty());
        assertEquals("Not found param", "3", path.isEmpty());
        assertEquals("Not found param", "4", params.isEmpty());
    }

    @Test
    public void testStartsWith() {

        assertEquals("Incorrect of param", "2", port.startsWith(":"));
        assertEquals("Incorrect of param", "3", path.startsWith("/"));
        assertEquals("Incorrect of param", "4", params.startsWith("?"));
    }

    @Test
    public void testEndsWith() {

        assertEquals("Incorrect of param", "1", protocol.endsWith("//"));
    }

    @Test
    public void testIsBlank() {
        assertEquals("Incorrect of param", "5", domain.isBlank());
    }

}
