package model.Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalProductTest {
    @Test
    void MedicalProductConstructor() {
        Product p1 = new MedicalProduct(12.9f, "Pill");

        assertEquals(ProductType.MedicalProduct, p1.getProductType());
        assertEquals("Pill", p1.getName());
        assertEquals(12.9f, p1.getPrice(),  0.001);
    }
}