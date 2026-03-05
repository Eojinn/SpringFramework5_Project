package mylab.order;

public class Product {
    private String id;
    private String name;
    private int price;

    public Product() {} 

    // 생성자 주입 시 XML의 순서와 맞추는 것이 좋습니다.
    public Product(String id, String name, int price) { 
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter/Setter는 그대로 유지하시면 됩니다.
    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public int getPrice() {
    	return price;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
}