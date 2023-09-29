public class MexicanPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildDough() {
        pizza.setDough("Pâte épaisse"); // Pâte épaisse pour la pizza mexicaine
    }

    public void buildSauce() {
        pizza.setSauce("Sauce épicée"); // Sauce épicée pour la pizza mexicaine
    }

    public void buildToppings() {
        pizza.setToppings("Cheddar Cheese, Jalapeños, Ground Beef"); // Garnitures pour la pizza mexicaine
    }

    public Pizza getPizza() {
        return pizza;
    }
}
