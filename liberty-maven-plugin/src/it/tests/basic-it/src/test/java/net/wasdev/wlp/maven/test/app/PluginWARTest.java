package net.wasdev.wlp.maven.test.app;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

import net.wasdev.wlp.maven.test.support.HttpUtils;

/**
 * 
 * Web application test case
 * 
 */

public class PluginWARTest {

    private String baseURL = "http://localhost:9080/";

    @Test
    public void testWAR() throws Exception {
        URL url = null;
        try {
            url = new URL(baseURL + "my-test-war/index.jsp");
            String textToFind = "Liberty";
            assertTrue(textToFind, HttpUtils.findStringInUrl(url, textToFind));
        } catch (MalformedURLException e) {
            fail("Fail to access " + url + " caused by " + e.getMessage());
        }
    }
}
