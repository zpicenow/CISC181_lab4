package cisc181.lab_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitTest {

    @Test
    public void test_getType() {
        Fruit fruit = new Fruit("apple", "red");
        assertEquals( "apple",fruit.getType());

    }

    @Test
    public void test_getColor() {
        Fruit fruit = new Fruit("apple", "red");
        assertEquals( "red",fruit.getColor());
    }

    @Test
    public void test_toString() {
        Fruit fruit = new Fruit("apple", "red");
        assertEquals( "red apple",fruit.toString());
    }
}