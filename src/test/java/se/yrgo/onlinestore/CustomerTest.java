package se.yrgo.onlinestore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testPlacingAnOrder(){
        Customer customer = new Customer(1,"Adam", "adam@email.com");
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.placeOrder(shoppingCart);
        assertEquals(1, customer.getOrderHistory().size());
    }
    @Test
    public void testViewOrderHistory(){
        Customer customer = new Customer(1,"Adam", "adam@email.com");
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.placeOrder(shoppingCart);
        assertEquals(customer.getOrderHistory().get(0), shoppingCart);
    }

    @Test
    public void testInvalidEmail(){
        assertThrows(IllegalArgumentException.class, () ->  new Customer(1,"Adam", "adam.email.com"));
    }
    @Test
    public void testInvalidCustomerId() {
        assertThrows(IllegalArgumentException.class, () -> new Customer(0, "Adam", "adam@email.com"));
    }
}
