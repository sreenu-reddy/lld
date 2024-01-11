package org.example.sree.designprinciples.dsp.conformation;

public class SMSBasedNotification implements NotificationCenter{
    @Override
    public void sendNotification(int orderId, int customerId) {
        System.out.println("Sending SMS --------");
    }
}
