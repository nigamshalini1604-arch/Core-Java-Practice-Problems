package org.example.notificationsystem;

public class PushNotification extends Notification {
    public String deviceToken;
    public String message;
    public PushNotification() {
        this.deviceToken = "default_device_token";
        this.message = "This is a push notification message.";
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending push notification to device token: " + deviceToken + " with message: " + message);
    }
}
