package org.example.notificationsystem;

public class NotificationMain {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        emailNotification.sendNotification();

        Notification smsNotification = new SMSNotification();
        smsNotification.sendNotification();

        Notification pushNotification = new PushNotification();

        pushNotification.sendNotification();
    }
}
