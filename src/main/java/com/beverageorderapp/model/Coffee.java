package main.java.com.beverageorderapp.model;

public class Coffee implements Drink {
    @Override
    public double getCost() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
