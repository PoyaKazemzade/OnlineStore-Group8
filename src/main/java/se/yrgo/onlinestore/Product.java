package se.yrgo.onlinestore;

import java.util.Objects;
/**
 * The Product class represents a product in an online store.
 * It contains information such as product ID, name, price, and quantity.
 */
public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be bigger than zero.");
        }

        else{
            this.price = price;
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can't be less than zero");
        }
        else{
            this.quantity = quantity;
        }

    }
    public Product(){

    }
    /**
     * Calculates the total value of the product.
     * @return the total value of the product
     */
    public double totalValueOfProduct(){

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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(price, product.price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, quantity);
    }
}


