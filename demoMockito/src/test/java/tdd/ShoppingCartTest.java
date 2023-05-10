package tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShoppingCartTest {

    @Test
    public void stubTest() {
        // Arrange
        ProductDetail expectedResult = new ProductDetail(1, "adidas", 500, 1000);

        Catalog catalog = Mockito.mock(Catalog.class);
        when(catalog.find(1)).thenReturn(new Product("adidas",500));
        ShoppingCart shopping = new ShoppingCart(catalog);

        // Act
        ProductDetail actualResult = shopping.detail(1, 2);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void verifyTest() {
        // Arrange
        ProductDetail expectedResult = new ProductDetail(1, "adidas", 500, 1000);

        Catalog catalog = Mockito.mock(Catalog.class);
        when(catalog.find(1)).thenReturn(new Product("adidas",500));
        ShoppingCart shopping = new ShoppingCart(catalog);

        // Act
        ProductDetail actualResult = shopping.detail(1, 2);

        // Assert
        verify(catalog).find(1);
        verify(catalog, times(1)).find(1);
    }
}
