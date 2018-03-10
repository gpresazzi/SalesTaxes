package model.Product;

import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.junit.Assert.assertEquals;

@Categories.IncludeCategory(Product.class)
public abstract class MedicalProductTest {
    @Test
    void MedicalProductConstructor() {
        Product p1 = new MedicalProduct(12.9f, "Pill");

        assertEquals(ProductType.MedicalProduct, p1.getProductType());
        assertEquals("Pill", p1.getName());
        assertEquals(12.9f, p1.getPrice(),  0.001);
    }
}