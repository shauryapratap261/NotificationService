package models.Message;

import models.Notification.NotificationSender;

public abstract class Message {

    NotificationSender notificationSender;

    public Message(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public abstract void sendMessage();
}
