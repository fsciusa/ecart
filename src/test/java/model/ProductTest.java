package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testId() {
        Product phone = new Product(1, 2000, "Phone");
        assertEquals(1, phone.getId());
    }

    @Test
    public void testPrice() {
        Product phone = new Product(1, 2000, "Phone");
        assertEquals(2000.0, phone.getPrice(), 0.0001);
    }

}
