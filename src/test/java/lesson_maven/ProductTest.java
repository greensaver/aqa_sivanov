package lesson_maven;

import lesson_15.Product;
import lesson_15.ProductMarket;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void checkProductNames(){
        Product product = new Product("Potatoes", 5);
        ProductMarket market = new ProductMarket(List.of(product));
        String name = market.getProductNames().get(0);
        assertEquals(product.getName(), name, "Unexpected product name");
    }

    @Test
    public void checkProductNamesSorted(){
        Product product3 = new Product("Tomatoes", 15);
        Product product1 = new Product("Potatoes", 5);
        Product product2 = new Product("Banana", 1);

        ProductMarket market = new ProductMarket(List.of(product1, product2, product3));
        List<String> expected = List.of("Banana","Potatoes","Tomatoes");
        List<String> result = market.getProductNamesSorted();
        assertEquals(expected, result, "Unexpected product sort");
    }

    @Test
    public void checkExpensiveProducts(){
        Product product3 = new Product("Tomatoes", 15);
        Product product1 = new Product("Potatoes", 5);
        Product product2 = new Product("Rotten Banana", -1);

        ProductMarket market = new ProductMarket(List.of(product1, product2, product3));
        List<Integer> expected = List.of(15);
        List<Integer> result = market.getExpensiveProducts();
        assertEquals(expected, result, "Unexpected product price");
    }

    @Test
    public void checkCheapProducts(){
        Product product3 = new Product("Tomatoes", 15);
        Product product1 = new Product("Potatoes", 5);
        Product product2 = new Product("Rotten Banana", -1);

        ProductMarket market = new ProductMarket(List.of(product1, product2, product3));
        List<Integer> expected = List.of(-1);
        List<Integer> result = market.getCheapProducts();
        assertEquals(expected, result, "Unexpected product price");
    }

    @Test
    public void checkProductPricesAsString(){
        Product product1 = new Product("Tomatoes", 15);
        Product product2 = new Product("Potatoes", 5);
        Product product3 = new Product("Rotten Banana", -1);

        ProductMarket market = new ProductMarket(List.of(product1, product2, product3));
        List<String> expected = List.of("15", "5", "-1");
        List<String> result = market.getProductPricesAsString();
        assertEquals(expected, result, "Unexpected product price (not in String)");
    }
}
