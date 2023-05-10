package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void stubTest() {
        // Arrange
        ProductDetail expectedResult = new ProductDetail();
        ShoppingCart shopping = new ShoppingCart();

        // Act
        ProductDetail actualResult = shopping.detail(1, 2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
