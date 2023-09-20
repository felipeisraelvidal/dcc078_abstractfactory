package abstractfactory;

import abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleTest {

    @Test
    public void shouldManufactureiPhoneScreen() {
        ProductFactory factory = new iPhoneFactory();
        Apple apple = new Apple(factory);
        assertEquals("iPhone's screeen is done.", apple.manufactureScreen());
    }

    @Test
    public void shouldManufactureiPhoneChip() {
        ProductFactory factory = new iPhoneFactory();
        Apple apple = new Apple(factory);
        assertEquals("iPhone's chip is done", apple.manufactureChip());
    }

    @Test
    public void shouldManufactureMacBookScreen() {
        ProductFactory factory = new MacBookFactory();
        Apple apple = new Apple(factory);
        assertEquals("MacBook's screen is done.", apple.manufactureScreen());
    }

    @Test
    public void shouldManufactureMacBookChip() {
        ProductFactory factory = new MacBookFactory();
        Apple apple = new Apple(factory);
        assertEquals("MacBook's chip is done.", apple.manufactureChip());
    }

}
