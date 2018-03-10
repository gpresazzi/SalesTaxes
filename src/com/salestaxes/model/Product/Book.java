package com.salestaxes.model.Product;

public class Book extends Product {
    public Book(float price, String Name)
    {
        super(price, Name, ProductType.Book);
    }
}
