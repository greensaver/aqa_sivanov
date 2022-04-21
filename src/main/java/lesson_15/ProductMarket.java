package lesson_15;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor

public class ProductMarket {
    private List<Product> products;

    public List<String> getProductNames() {
        return products.stream()
                .map(product -> product.getName())
                .collect(Collectors.toList());
    }

    public List<String> getProductNamesSorted() {
        List<String> productNames = getProductNames();
        Collections.sort(productNames);
        return productNames;
    }

    public List<Integer> getExpensiveProducts() {
        return products.stream()
                .filter(product -> product.getPrice() > 10)
                .map(product -> product.getPrice())
                .collect(Collectors.toList());
    }

    public List<Integer> getCheapProducts() {
        return products.stream()
                .filter(product -> product.getPrice() < 0)
                .map(product -> product.getPrice())
                .collect(Collectors.toList());
    }

    public List<String> getProductPricesAsString() {
        return products.stream()
                .map(product -> Integer.toString(product.getPrice()))
                .collect(Collectors.toList());
    }

}
