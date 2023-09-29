public class ItalianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildDough() {
        pizza.setDough("Pâte fine"); // Pâte fine pour la pizza italienne
    }

    public void buildSauce() {
        pizza.setSauce("Sauce tomate"); // Sauce tomate pour la pizza italienne
    }

    public void buildToppings() {
        pizza.setToppings("Mozzarella, Pepperoni, Olives"); // Garnitures pour la pizza italienne
    }

    public Pizza getPizza() {
        return pizza;
    }
}
