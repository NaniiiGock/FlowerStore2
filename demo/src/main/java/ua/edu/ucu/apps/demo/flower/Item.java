package ua.edu.ucu.apps.demo.flower;

public abstract class Item {
    float price;
    public abstract double getPrice();
    public void setPrice(Float price) {
        this.price = price;
    }
}
