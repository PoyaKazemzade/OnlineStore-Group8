package se.yrgo.onlinestore;

/**
 * Main class to demonstrate the functionality of an online store.
 * This class allows a customer to choose products, add them to a shopping cart,
 * view their order history, and see the total amount to pay.
 */
public class Main {
    /**
     * The main method that simulates the functionality of the online store.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Arnold Schwarzenegger", "Arnold@hotmail.com");
        System.out.println(customer);

        Product product1 = new Product(1, "T-Shirt", 20.0, 2);
        Product product2 = new Product(2, "Jacket", 200.0, 1);
        Product product3 = new Product(3, "Socks", 15.0, 3);
        Product product4 = new Product(4, "Scarf", 25.0, 2);
        Product product5 = new Product(5, "Shoes", 150.0, 1);
        Product product6 = new Product(6, "Suit", 500.0, 1);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);



        ShoppingCart shoppingCart2 = new ShoppingCart();

        shoppingCart2.addProduct(product4);
        shoppingCart2.addProduct(product5);
        shoppingCart2.addProduct(product6);



        customer.placeOrder(shoppingCart);
        customer.placeOrder(shoppingCart2);


        System.out.println("Order History:");
        for (ShoppingCart cart : customer.getOrderHistory()) {
            System.out.println("Order:");
            cart.viewCartItems();
            System.out.println("Total Cost: $" + cart.calculateTotalCost());
            System.out.println();
        }
    }
}

