package org.example.sree.designprinciples.dsp.conformation;

public class UPIBasedPayment implements PaymentProcessor{
    @Override
    public void processPayment(int orderId, int customerId) {
        System.out.println("Payment made through ....UPI....");
    }
}
