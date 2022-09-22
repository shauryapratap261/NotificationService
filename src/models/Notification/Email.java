package models.Notification;

import models.Notification.NotificationSender;

public class Email implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending an Email");
    }
}
