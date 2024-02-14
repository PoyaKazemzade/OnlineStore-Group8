package se.yrgo.onlinestore;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart that holds a list of products.
 */
public class ShoppingCart {
    private List<Product> products;

    /**
     * Constructs a new empty shopping cart.
     */
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param product The product to be added to the cart.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Removes a product from the shopping cart.
     *
     * @param product The product to be removed from the cart.
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    /**
     * Calculates the total cost of all products in the shopping cart.
     *
     * @return The total cost of all products in the shopping cart.
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    /**
     * Displays the items in the shopping cart.
     * If the cart is empty, prints a message indicating so.
     */
    public void viewCartItems() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty!");
        }
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}
