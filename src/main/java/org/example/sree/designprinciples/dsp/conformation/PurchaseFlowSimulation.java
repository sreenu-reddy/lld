package org.example.sree.designprinciples.dsp.conformation;

public class PurchaseFlowSimulation {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new UPIBasedPayment();
        NotificationCenter notificationCenter = new SMSBasedNotification();
        PurchaseFlowManager manager = new PurchaseFlowManager(paymentProcessor,notificationCenter);
        manager.triggerPurchaseFlow(1,2);
    }
}
