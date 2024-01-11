package org.example.sree.designprinciples.dsp.conformation;

public class PurchaseFlowManager {
    private final PaymentProcessor paymentProcessor;
    private final NotificationCenter notificationCenter;


    public PurchaseFlowManager(PaymentProcessor paymentProcessor, NotificationCenter notificationCenter) {
        this.paymentProcessor = paymentProcessor;
        this.notificationCenter = notificationCenter;
    }

    public void triggerPurchaseFlow(int productId,int customerId){

        // happy scenario
        paymentProcessor.processPayment(productId,customerId);
        notificationCenter.sendNotification(productId,customerId);
    }
}
