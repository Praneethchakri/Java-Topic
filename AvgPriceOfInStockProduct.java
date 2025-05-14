package stream.functions;

import java.util.ArrayList;
import java.util.List;

public class AvgPriceOfInStockProduct {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        Product p1 = new Product(1,"Iphone",234.32);
        Product p2 = new Product(2,"Nokia",234.32);

        Product p3 = new Product(3,"Samsung",234.32);

        Product p4 = new Product(4,"Iphone",294.32);
        Product p5 = new Product(5,"Samsung",294.32);

        Product p6 = new Product(6,"Samsung",214.32);
        productList.add(p1);productList.add(p2);
        productList.add(p3);productList.add(p4);
        productList.add(p5);productList.add(p6);

        double result = productList.stream()
                .filter(product -> product.productName.equals("Iphone"))
//                .mapToDouble(Product::getProductPrice)
                .mapToInt(Product::getProductId)
                .average()
                .orElse(0);
        System.out.println(result);


    }


}
