package se.yrgo.onlinestore;

class ShoppingCartTest {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1000, 2);
        Product product2 = new Product(2, "Mouse", 20, 5);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        assert cart.calculateTotalCost() == 2040;
        System.out.println("ShoppingCartTest Passed");
    }
}
