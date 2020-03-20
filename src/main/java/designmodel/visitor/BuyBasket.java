package designmodel.visitor;

import java.util.ArrayList;
import java.util.List;

public class BuyBasket {
	private List<Product> products = new ArrayList();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public void accept(Visitor visitor) {
		for (Product product : products) {
			product.accept(visitor);
		}
	}
}
