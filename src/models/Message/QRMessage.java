package models.Message;

import models.Notification.NotificationSender;

public class QRMessage extends Message {

    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is a QR message");
    }

    @Override
    public void sendMessage() {
        notificationSender.sendNotification();
    }
}
