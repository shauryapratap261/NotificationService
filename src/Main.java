import models.Message.QRMessage;
import models.Message.TextMessage;
import models.Notification.Email;
import models.Notification.SMS;

public class Main {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage(new Email());
        textMessage.sendMessage();

        QRMessage qrMessage = new QRMessage(new SMS());
        qrMessage.sendMessage();
    }
}
