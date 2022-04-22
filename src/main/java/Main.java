import lesson_15.Product;
import lesson_15.ProductMarket;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Potatoes", 5);
        Product product2 = new Product("Rotten Banana", -1);
        Product product3 = new Product("Tomatoes", 15);
        Product product4 = new Product("Pasta", 20);
        Product product5 = new Product("Cucumber", 2);

        List<Product> products = List.of(product1, product2, product3, product4, product5);
        ProductMarket market = new ProductMarket(products);

        System.out.println("Имена продуктов ");
        market.getProductNames().forEach(System.out::println);
        System.out.println("Имена продуктов по алфавиту ");
        market.getProductNamesSorted().forEach(System.out::println);
        System.out.println("Цены продуктов больше 10 ");
        market.getExpensiveProducts().forEach(System.out::println);
        System.out.println("Цены продуктов меньше 0 ");
        market.getCheapProducts().forEach(System.out::println);
        System.out.println("Цены продуктов в String ");
        market.getProductPricesAsString().forEach(System.out::println);

    }
}