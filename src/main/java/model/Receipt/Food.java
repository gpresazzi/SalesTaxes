package model.Receipt;


import model.Product.Product;
import model.Product.ProductType;

public class Food extends Product {
    public Food(float price, String Name)
    {
        super(price, Name, ProductType.Food);
    }
}
