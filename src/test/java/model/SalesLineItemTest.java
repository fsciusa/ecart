package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalesLineItemTest {

    @Test
    public void testSubTotalOne() {
        Product prod = new ProductStub(1,2000,"Product");
        SalesLineItem item = new SalesLineItem(prod, 1);
        assertEquals(2000, item.getSubtotal(), 0.0001);
    }
    @Test
    public void testSubTotalMore() {
        Product prod = new ProductStub(1,2000,"Product");
        SalesLineItem item = new SalesLineItem(prod, 3);
        assertEquals(6000, item.getSubtotal(), 0.0001);

    }

    @Test
    public void testThrowException() {
        Product prod = new ProductStub(1,2000,"Product");
        assertThrows(IllegalArgumentException.class,
                () -> { new SalesLineItem(prod, 0); } );

    }

    class ProductStub extends Product {
        public ProductStub(int id, double price, String name) {
            super(id, price, name);
        }
        @Override
        public double getPrice() {
            return 2000.0;
        }
    }
}
