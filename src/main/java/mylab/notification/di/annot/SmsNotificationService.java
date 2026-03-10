package mylab.notification.di.annot;

public class SmsNotificationService implements NotificationService {
    private String provider;

    public SmsNotificationService(String provider) {
        this.provider = provider;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS 전송 (통신사: " + provider + "): " + message);
    }

    public String getProvider() { return provider; }
}