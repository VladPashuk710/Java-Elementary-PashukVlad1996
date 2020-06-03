package Homework_16;

import Homework_10.MyUrlBuilder;
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
    public void TestIsEmpty() {

        assertEquals("Not found param", "1", protocol.isEmpty());
        assertEquals("Not found param", "2", port.isEmpty());
        assertEquals("Not found param", "3", path.isEmpty());
        assertEquals("Not found param", "4", params.isEmpty());
    }

    @Test
    public void TestStartsWith() {

        assertEquals("Incorrect of param", "1", protocol.endsWith("://"));
        assertEquals("Incorrect of param", "2", port.startsWith(":"));
        assertEquals("Incorrect of param", "3", path.startsWith("/"));
        assertEquals("Incorrect of param", "4", params.startsWith("?"));
    }
}
