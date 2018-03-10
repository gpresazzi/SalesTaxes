package com.salestaxes.model.Receipt;

import com.salestaxes.model.Product.Product;
import com.salestaxes.model.Product.ProductType;

public class Food extends Product {
    public Food(float price, String Name)
    {
        super(price, Name, ProductType.Food);
    }
}
