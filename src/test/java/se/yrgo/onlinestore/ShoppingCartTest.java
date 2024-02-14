package se.yrgo.onlinestore;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the ShoppingCart class.
 */
public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    private Product product1;
    private Product product2;

    /**
     * Initializes the shopping cart and products before each test case.
     */
    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
        product1 = new Product(1, "knife", 10.0, 100);
        product2 = new Product(2, "Cheese", 20.0, 20);
    }

    /**
     * Tests the addProduct() method of the ShoppingCart class.
     * Adds products to the cart and checks if the correct number of products is present.
     */
    @Test
    void addProduct() {
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        assertEquals(2, shoppingCart.getProducts().size());
    }

    /**
     * Tests the removeProduct() method of the ShoppingCart class.
     * Adds products to the cart, removes one, and checks if the correct number of products is present.
     */
    @Test
    void removeProduct() {
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.removeProduct(product1);
        assertEquals(1, shoppingCart.getProducts().size());
        assertFalse(shoppingCart.getProducts().contains(product1));
    }

    /**
     * Tests the calculateTotalCost() method of the ShoppingCart class.
     * Adds products to the cart and checks if the total cost is calculated correctly.
     */
    @Test
    void calculateTotalCost() {
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        assertEquals(30.0, shoppingCart.calculateTotalCost());
    }

}
