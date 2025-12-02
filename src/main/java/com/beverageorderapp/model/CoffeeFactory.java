package main.java.com.beverageorderapp.model;

public class CoffeeFactory extends DrinkFactory {
    @Override
    protected Drink createDrink() {
        return new Coffee();
    }
}
