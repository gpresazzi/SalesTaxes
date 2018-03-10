package model.Product;

public abstract class Product {
    private float price = 0;
    private ProductType prodType = null;
    private String name = "";
    private float tax = 0;

    /**
     *
     * @param price
     * @param name
     * @param type
     */
    public Product(float price, String name, ProductType type)
    {
        this.price = price;
        this.prodType = type;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return prodType;
    }

    public String getName() {
        return name;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTax() {
        return tax;
    }

    /**
     * Return total price of product including tax
     * @return
     */
    public float getTotalPrice()
    {
        return price + tax;
    }
}
