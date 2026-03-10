// NotificationManager.java
package mylab.notification.di.annot;

public class NotificationManager {
    private NotificationService emailService;
    private NotificationService smsService;

    public NotificationManager(NotificationService emailService, NotificationService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    // 인터페이스 타입을 구체 클래스 타입으로 캐스팅해서 반환해야 테스트가 가능합니다.
    public EmailNotificationService getEmailService() {
        return (EmailNotificationService) this.emailService;
    }

    public SmsNotificationService getSmsService() {
        return (SmsNotificationService) this.smsService;
    }
    
    public void sendNotificationByEmail(String message) { emailService.sendNotification(message); }
    public void sendNotificationBySms(String message) { smsService.sendNotification(message); }
}