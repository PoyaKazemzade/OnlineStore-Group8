package se.yrgo.onlinestore;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    private Product product1;
    private Product product2;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
        product1 = new Product(1, "knife", 10.0, 100);
        product2 = new Product(2, "Cheese", 20.0, 20);
    }


    @Test
    void addProductTest() {
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        assertEquals(2, shoppingCart.getProducts().size());
    }


    @Test
    void removeProductTest() {
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.removeProduct(product1);
        assertEquals(1, shoppingCart.getProducts().size());
        assertFalse(shoppingCart.getProducts().contains(product1));
    }


    @Test
    void calculateTotalCostTest() {
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        assertEquals(30.0, shoppingCart.calculateTotalCost());
    }

}
