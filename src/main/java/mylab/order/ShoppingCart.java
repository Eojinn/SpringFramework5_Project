package mylab.order;

import java.util.List;

public class ShoppingCart {
    private List<Product> products; // Product 객체 목록을 포함해야 합니다.

    public List<Product> getProducts() {
    	return products;
    }
    public void setProducts(List<Product> products) {
    	this.products = products;
    } // <list> 주입용 Setter입니다.
    
}