package mylab.order;

public class OrderService {
    private ShoppingCart shoppingCart;

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    // [중요] 이 메서드가 있어야 테스트 클래스에서 호출할 수 있습니다.
    public void order() {
        System.out.println("[주문 시스템] 주문 처리를 시작합니다.");
        if (shoppingCart != null && shoppingCart.getProducts() != null) {
            for (Product product : shoppingCart.getProducts()) {
                System.out.println("주문 상품: " + product.getName() + " (가격: " + product.getPrice() + ")");
            }
        } else {
            System.out.println("장바구니가 비어 있습니다.");
        }
    }
}