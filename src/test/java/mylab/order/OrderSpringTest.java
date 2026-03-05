package mylab.order;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:mylab-order-di.xml")
public class OrderSpringTest {

    @Autowired
    private ShoppingCart shoppingCart;

    @Autowired
    private OrderService orderService;

    @Test
    void testDI() {
        // ShoppingCart 검증
        assertNotNull(shoppingCart, "ShoppingCart 주입 실패");
        assertEquals(2, shoppingCart.getProducts().size(), "장바구니 상품 개수 오류");
        assertEquals("노트북", shoppingCart.getProducts().get(0).getName());
        assertEquals("스마트폰", shoppingCart.getProducts().get(1).getName());

        // OrderService 검증 및 실행
        assertNotNull(orderService, "OrderService 주입 실패");
        orderService.order(); // 이제 에러가 나지 않습니다!
    }
}