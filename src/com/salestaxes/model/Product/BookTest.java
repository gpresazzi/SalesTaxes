package com.salestaxes.model.Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void BookTest() {
        Product p1 = new Book(12.44f, "book");

        assertEquals(ProductType.Book, p1.getProductType());
        assertEquals("book", p1.getName());
        assertEquals(12.44f, p1.getPrice(),  0.001);
    }
}