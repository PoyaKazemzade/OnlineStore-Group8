package se.yrgo.onlinestore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    public void testTotalValueOfProduct(){
        Product p1 = new Product(1, "Ketchup", 10, 100);
        assertEquals(1000, p1.totalValueOfProduct());
    }
    @Test
    public void testSettingPriceToZero() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, () ->  new Product(1,"Ketchup", 0, 10).totalValueOfProduct());

    }
    @Test
    public void testEnteringNegativeQuantity() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, () ->  new Product(1,"Ketchup", 0, -10).totalValueOfProduct());
    }

}
