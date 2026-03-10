package mylab.notification.di.annot;

public class EmailNotificationService implements NotificationService {
    private String smtpServer;
    private int port;

    public EmailNotificationService(String smtpServer, int port) {
        this.smtpServer = smtpServer;
        this.port = port;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("이메일 전송 [" + smtpServer + ":" + port + "]: " + message);
    }

    public String getSmtpServer() { return smtpServer; }
    public int getPort() { return port; }
}