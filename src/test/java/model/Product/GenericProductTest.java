package model.Product;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class GenericProductTest {
    @Test
    void GenericProductConstructor() {
        GenericProduct p1 = new GenericProduct(12.49f, "Chocolate");

        assertEquals(ProductType.Other, p1.getProductType());
        assertEquals("Chocolate", p1.getName());
        assertEquals(12.49f, p1.getPrice(),  0.001);
    }
}