package models.Message;

import models.Notification.NotificationSender;

public class TextMessage extends Message {
    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is a Text message");
    }

    @Override
    public void sendMessage() {
        notificationSender.sendNotification();
    }
}
