package ua.edu.ucu.apps.demo.order;

import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.LinkedList;

public class Order {
    LinkedList items;
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }
    public void setDeliveryState(Delivery delivery) {
        this.delivery = delivery;
    }
    public float calculateTotalPrice (LinkedList items) {
        float totalprice = 0;
//        for (int i = 0; i < items.size(); i++) {
//            totalprice +=;
//        }
        return totalprice;
    }
    public void processOrder() {
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item) {
        this.items.remove(item);
    }


//        if (paymentStrategy.pay()) {
//            deliverStrategy.deliver();
//        }

}
