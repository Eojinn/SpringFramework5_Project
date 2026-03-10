package mylab.user.di.annot;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @SpringJUnitConfig는 @ContextConfiguration과 @ExtendWith를 합친 것입니다.
 */
@SpringJUnitConfig(locations = "classpath:mylab-user-di.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService() {
        // 1. UserService 주입 여부 확인
        assertNotNull(userService, "UserService가 주입되지 않았습니다.");

        // 2. UserRepository 주입 여부 확인
        assertNotNull(userService.getUserRepository(), "UserRepository가 주입되지 않았습니다.");

        // 3. dbType 값이 MySQL인지 확인
        assertEquals("MySQL", userService.getUserRepository().getDbType(), "DB 타입이 MySQL이 아닙니다.");

        // 4. SecurityService 주입 여부 확인
        assertNotNull(userService.getSecurityService(), "SecurityService가 주입되지 않았습니다.");

        // 5. registerUser 메서드 동작 확인
        boolean result = userService.registerUser("eojin123", "김어진", "pass123");
        assertTrue(result, "사용자 등록에 실패했습니다.");
    }
}