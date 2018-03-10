package model.Product;

public class MedicalProduct extends Product {
    public MedicalProduct(float price, String Name)
    {
        super(price, Name, ProductType.MedicalProduct);
    }
}
