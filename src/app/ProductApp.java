package app;
import data.*;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 10000);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);

        Product product1 = new Product("Mac Book Pro", 10000);

        System.out.println(product.equals(product1));
        System.out.println(product.hashCode() == product1.hashCode());
    }
}
