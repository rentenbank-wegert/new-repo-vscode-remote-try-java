package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AppTest {
    public AppTest() {
    }

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testMore() {
        assertTrue(true);
    }

    @Test
    public void testFailure() {
        assertTrue("Dieser Unittest führt zum Fehler, um den Unittest im Buildworkflow zu testen", true);
    }
}
