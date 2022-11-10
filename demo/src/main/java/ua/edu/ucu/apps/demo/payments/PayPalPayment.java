package ua.edu.ucu.apps.demo.payments;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PayPalPayment implements  Payment{
    private String name;
    private String description;

    public PayPalPayment() {
        name = "Paypal";
        description = "PayPal payment";
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid with paypal");
        return true;
    }
}
