package com.salestaxes.model.Receipt;

import com.salestaxes.model.Product.Product;

public class ReceiptItem {
    private Product product = null;
    private ExpenseType expenseType;

    public ReceiptItem(Product product, ExpenseType type)
    {
        this.product = product;
        this.expenseType = type;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public Product getProduct() {
        return product;
    }
}
