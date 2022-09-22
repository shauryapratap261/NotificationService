package models.Notification;

import models.Notification.NotificationSender;

public class SMS implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("We're going to send an SMS");
    }
}
