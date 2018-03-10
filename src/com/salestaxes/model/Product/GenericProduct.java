package com.salestaxes.model.Product;

public class GenericProduct extends Product {
    public GenericProduct(float price, String Name)
    {
        super(price, Name, ProductType.Other);
    }
}