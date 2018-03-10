package model.Product;

import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.junit.Assert.assertEquals;

@Categories.IncludeCategory(Product.class)
public abstract class BookTest {
    @Test
    void BookTest() {
        Product p1 = new Book(12.44f, "book");

        assertEquals(ProductType.Book, p1.getProductType());
        assertEquals("book", p1.getName());
        assertEquals(12.44f, p1.getPrice(),  0.001);
    }
}