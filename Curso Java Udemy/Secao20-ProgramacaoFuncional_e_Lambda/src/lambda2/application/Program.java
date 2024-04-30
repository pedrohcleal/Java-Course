package lambda2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lambda2.entities.Product;
import lambda2.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);
		//list.removeIf(new ProductPredicate());  <- mesma opção de cima.
		//list.removeIf(Product::staticProductPredicate); <- mesma opção de cima.
		//list.removeIf(Product::nonStaticProductPredicate)  <- mesma opção de cima.
		//Predicate<Product> pred = p -> p.getPrice() >= 100; <- mesma opção de cima.

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
