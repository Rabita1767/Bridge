package pizza.restaurant;

interface Pizza {
    void assemble();
    void qualityCheck();
}

// Concrete Pizza classes
class PepperoniPizza implements Pizza {
    @Override
    public void assemble() {
        // Implement how to assemble a Pepperoni Pizza
        System.out.println("Assembling Pepperoni Pizza");
    }

    @Override
    public void qualityCheck() {
        // Implement quality check for a Pepperoni Pizza
        System.out.println("Performing quality check for Pepperoni Pizza");
    }
}

class VeggiePizza implements Pizza {
    @Override
    public void assemble() {
        // Implement how to assemble a Veggie Pizza
        System.out.println("Assembling Veggie Pizza");
    }

    @Override
    public void qualityCheck() {
        // Implement quality check for a Veggie Pizza
        System.out.println("Performing quality check for Veggie Pizza");
    }
}

// Abstract Restaurant class
abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}

// Concrete Italian Restaurant class
class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addToppings() {
        System.out.println("Adding Italian toppings");
    }

    @Override
    void addSauce() {
        System.out.println("Adding Italian sauce");
    }

    @Override
    void makeCrust() {
        System.out.println("Making thin Italian crust");
    }
}

// Concrete American Restaurant class
class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addToppings() {
        System.out.println("Adding American toppings");
    }

    @Override
    void addSauce() {
        System.out.println("Adding American sauce");
    }

    @Override
    void makeCrust() {
        System.out.println("Making thick American crust");
    }
}


