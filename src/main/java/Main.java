import model.Product.Book;
import model.Product.GenericProduct;
import model.Product.MedicalProduct;
import model.Product.Product;
import model.Receipt.ExpenseType;
import model.Receipt.Food;
import model.Receipt.Receipt;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //receipt 1
        Product p1 = new Book(12.49f, "book");
        Product p2 = new GenericProduct(14.99f, "music CD");
        Product p3 = new Food(0.85f, "chocolate bar");

        Receipt rec1 = new Receipt();
        rec1.addItem(p1, ExpenseType.Purchased);
        rec1.addItem(p2, ExpenseType.Purchased);
        rec1.addItem(p3, ExpenseType.Purchased);

        rec1.computeTaxes();
        System.out.println(rec1.toString());

        //receipt 2
        Product p4 = new Food(10.00f, "box of chocolates");
        Product p5 = new GenericProduct(47.50f, "bottle of perfume");

        Receipt rec2 = new Receipt();
        rec2.addItem(p4, ExpenseType.Imported);
        rec2.addItem(p5, ExpenseType.Imported);

        rec2.computeTaxes();
        System.out.println(rec2.toString());

        //receipt 1
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
        System.out.println(rec3.toString());

    }
}
