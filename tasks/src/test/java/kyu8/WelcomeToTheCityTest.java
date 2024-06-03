package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeToTheCityTest {
    @Test
    void test1() throws Exception {
        WelcomeToTheCity h = new WelcomeToTheCity();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }
}