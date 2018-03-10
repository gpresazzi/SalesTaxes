package model.Receipt;

import model.Product.Book;
import model.Product.GenericProduct;
import model.Product.MedicalProduct;
import model.Product.Product;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.junit.Assert.assertEquals;

@Categories.IncludeCategory(Receipt.class)
public abstract class ReceiptTest {

    @Test
    void Test1() {
        Product p1 = new Book(12.49f, "book");
        Product p2 = new GenericProduct(14.99f, "Cd");

        Receipt receipt1 = new Receipt();
        receipt1.addItem(p1, ExpenseType.Purchased);
        receipt1.addItem(p2, ExpenseType.Purchased);

        receipt1.computeTaxes();

        assertEquals(p1.getTax(), 0f,  0.001);
        assertEquals(p2.getTax(), 1.50f,  0.001);
    }

    @Test
    void Test2() {
        //receipt 1
        Product p1 = new Book(12.49f, "book");
        Product p2 = new GenericProduct(14.99f, "music CD");
        Product p3 = new Food(0.85f, "chocolate bar");

        Receipt rec1 = new Receipt();
        rec1.addItem(p1, ExpenseType.Purchased);
        rec1.addItem(p2, ExpenseType.Purchased);
        rec1.addItem(p3, ExpenseType.Purchased);

        rec1.computeTaxes();

        assertEquals(rec1.getTotalExpens(), 29.83f,  0.001);
        assertEquals(rec1.getTotalTaxes(), 1.50,  0.001);
    }

    @Test
    void Test3() {
        //receipt 2
        Product p4 = new Food(10.00f, "box of chocolates");
        Product p5 = new GenericProduct(47.50f, "bottle of perfume");

        Receipt rec2 = new Receipt();
        rec2.addItem(p4, ExpenseType.Imported);
        rec2.addItem(p5, ExpenseType.Imported);

        rec2.computeTaxes();

        assertEquals(rec2.getTotalExpens(), 65.15f,  0.001);
        assertEquals(rec2.getTotalTaxes(), 7.65f,  0.001);
    }

    @Test
    void Test4() {
        //receipt 3
        Product p6 = new GenericProduct(27.99f, "bottle of perfume");
        Product p7 = new GenericProduct(18.99f, "bottle of perfume");
        Product p8 = new MedicalProduct(9.75f, "headache pills");
        Product p9 = new Food(11.25f, "box of chocolates");

        Receipt rec3 = new Receipt();
        rec3.addItem(p6, ExpenseType.Imported);
        rec3.addItem(p7, ExpenseType.Purchased);
        rec3.addItem(p8, ExpenseType.Purchased);
        rec3.addItem(p9, ExpenseType.Imported);

        rec3.computeTaxes();

        assertEquals(rec3.getTotalExpens(), 74.68f,  0.001);
        assertEquals(rec3.getTotalTaxes(), 6.70f,  0.001);
    }
}