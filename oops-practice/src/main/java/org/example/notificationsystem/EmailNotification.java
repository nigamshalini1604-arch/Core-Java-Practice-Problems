package org.example.notificationsystem;

public class EmailNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
    }
}
