package lambda3_java.util;

import java.util.function.Consumer;

import lambda3_java.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
