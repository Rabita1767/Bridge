package pizza.restaurant;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PepperoniPizza();
        Pizza veggiePizza = new VeggiePizza();

        Restaurant italianRestaurant = new ItalianRestaurant(pepperoniPizza);
        italianRestaurant.deliver();

        Restaurant americanRestaurant = new AmericanRestaurant(veggiePizza);
        americanRestaurant.deliver();
    }
}
