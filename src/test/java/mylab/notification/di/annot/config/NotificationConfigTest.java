package mylab.notification.di.annot.config;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import mylab.notification.di.annot.EmailNotificationService;
import mylab.notification.di.annot.NotificationManager;
import mylab.notification.di.annot.SmsNotificationService;
import mylab.notification.di.annot.config.*;

@SpringJUnitConfig(NotificationConfig.class) // 자바 설정 클래스 지정
public class NotificationConfigTest {

    @Autowired
    private NotificationManager notificationManager;

    @Test
    public void testNotificationManager() {
        // a. NotificationManager 주입 확인
        assertNotNull(notificationManager, "NotificationManager가 주입되지 않았습니다.");

        // b, c. 이메일 서비스 검증
        EmailNotificationService emailService = notificationManager.getEmailService();
        assertNotNull(emailService, "이메일 서비스가 주입되지 않았습니다.");
        assertEquals("smtp.gmail.com", emailService.getSmtpServer());
        assertEquals(587, emailService.getPort());

        // d. SMS 서비스 검증
        SmsNotificationService smsService = notificationManager.getSmsService();
        assertNotNull(smsService, "SMS 서비스가 주입되지 않았습니다.");
        assertEquals("SKT", smsService.getProvider());

        // e. 메서드 실행 테스트
        notificationManager.sendNotificationByEmail("테스트 이메일");
        notificationManager.sendNotificationBySms("테스트 SMS");
    }
}