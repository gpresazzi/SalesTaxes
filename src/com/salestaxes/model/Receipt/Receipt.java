package com.salestaxes.model.Receipt;

import com.salestaxes.model.Product.Product;
import com.salestaxes.model.Product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<ReceiptItem> receiptItemList = null;
    private float totalTaxes = 0;
    private float totalExpens = 0;

    public Receipt()
    {
        receiptItemList = new ArrayList<ReceiptItem>();
    }

    public void addItem(Product p, ExpenseType expenseType)
    {
        if(p==null)
            throw new NullPointerException();
        if(expenseType==ExpenseType.None)
            throw new IndexOutOfBoundsException();

        ReceiptItem tmpItem = new ReceiptItem(p, expenseType);
        receiptItemList.add(tmpItem);
    }

    public float getTotalExpens() {
        return totalExpens;
    }

    public float getTotalTaxes() {
        return totalTaxes;
    }

    /***
     * Round the tax to nearest up 0.05
     * @param tax
     * @return
     */
    private float roundToNext05(float tax)
    {
        double rounded = Math.ceil(tax * 20.0) / 20.0;
        return (float)rounded;
    }

    /**
     * Compute taxes for all product
     */
    public void computeTaxes()
    {
        for (ReceiptItem item: receiptItemList) {
            Product prod = item.getProduct();
            totalExpens += prod.getPrice();
            if(item.getExpenseType() == ExpenseType.Imported) {
                float tmpTax = + roundToNext05(prod.getPrice() * 0.05f);
                prod.setTax(prod.getTax() + tmpTax);
                totalTaxes += tmpTax;
                totalExpens += tmpTax;
            }

            if(prod.getProductType() == ProductType.Other){
                float tmpTax = + roundToNext05(prod.getPrice() * 0.1f);
                prod.setTax(prod.getTax() + tmpTax);
                totalTaxes += tmpTax;
                totalExpens += tmpTax;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (ReceiptItem item: receiptItemList) {
            str.append("1 ");
            if(item.getExpenseType() == ExpenseType.Imported)
                str.append(" imported ");
            str.append(item.getProduct().getName() + ":");
            str.append(item.getProduct().getTotalPrice() + "\n");
        }
        str.append("Sales Taxes: " + totalTaxes + "\n");
        str.append("Total: " + totalExpens + "\n");
        return str.toString();
    }
}
