package se.yrgo.onlinestore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    public void testTotalValueOfProduct(){
        Product p1 = new Product(1,"Ketchup" ,20 , 100);
        assertEquals(p1.getPrice() * p1.getQuantity(), p1.totalValueOfProduct(20,100));
    }
    @Test
    public void testSettingPriceToZero() throws IllegalArgumentException{
        Product p1 = new Product(1,"Ketchup" ,0 , 100);
        assertThrows(IllegalArgumentException.class, () -> p1.totalValueOfProduct(0,100));

    }
    @Test
    public void testEnteringNegativeQuantity() throws IllegalArgumentException{
        Product p1 = new Product(1,"Ketchup" ,20 , -10);
        assertThrows(IllegalArgumentException.class, () -> p1.totalValueOfProduct(20,-10));
    }

}
