package se.yrgo.onlinestore;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(){

    }

    public double totalValueOfProduct(double price, int quantity){
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be bigger than zero.");
        } else if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can't be less than zero");
        }

        return price * quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


