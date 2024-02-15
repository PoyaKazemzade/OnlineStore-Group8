package se.yrgo.onlinestore;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart that holds a list of products.
 */
public class ShoppingCart {
    private List<Product> shoppingCart;

    /**
     * Constructs a new empty shopping cart.
     */
    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param product The product to be added to the cart.
     */
    public void addProduct(Product product) {
        shoppingCart.add(product);
    }

    /**
     * Removes a product from the shopping cart.
     *
     * @param product The product to be removed from the cart.
     */
    public void removeProduct(Product product) {
        if (!shoppingCart.isEmpty()) {
            shoppingCart.remove(product);
        } else {
            throw new IllegalArgumentException("Your cart is empty!");
        }
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    /**
     * Calculates the total cost of all products in the shopping cart.
     *
     * @return The total cost of all products in the shopping cart.
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : shoppingCart) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    /**
     * Displays the items in the shopping cart.
     * If the cart is empty, prints a message indicating so.
     */
    public void viewCartItems() {
        if (!shoppingCart.isEmpty()) {
            for (Product product : shoppingCart) {
                System.out.println(product.getName());
            }
        } else {
            throw new IllegalArgumentException("Your cart is empty!");
        }

    }
}
