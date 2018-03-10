package model.Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericProductTest {
    @Test
    void GenericProductConstructor() {
        Product p1 = new GenericProduct(12.49f, "Chocolate");

        assertEquals(ProductType.Other, p1.getProductType());
        assertEquals("Chocolate", p1.getName());
        assertEquals(12.49f, p1.getPrice(),  0.001);
    }
}