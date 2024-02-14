package se.yrgo.onlinestore;


import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Customer {
    private int customerId;
    private String name;
    private String email;

    private List<ShoppingCart> orderHistory;


    public Customer(int customerId, String name, String email) {
        if(customerId < 1){
            throw new IllegalArgumentException("Incorrect ID");
        }
        else {
            this.customerId = customerId;
        }
        this.name = name;
        if (!email.contains("@")){
            throw new IllegalArgumentException("Email must contain '@'");
        }
        else {
            this.email = email;
        }
        this.orderHistory = new ArrayList<>();

    }
    public Customer(){

    }

    public void viewOrderHistory() {
        for (ShoppingCart shoppingcart : orderHistory) {
            System.out.println(shoppingcart);
        }
    }

    public void placeOrder(ShoppingCart shoppingCart) {
        orderHistory.add(shoppingCart);
    }


    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<ShoppingCart> getOrderHistory() {
        return orderHistory;
    }


    @Override
    public String toString() {
        return "Customer:" + "\n"+
                "CustomerId: " + customerId + "\n"+
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "OrderHistory: " + orderHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(orderHistory, customer.orderHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, email, orderHistory);
    }
}

