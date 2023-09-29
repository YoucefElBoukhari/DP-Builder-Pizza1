public interface PizzaBuilder {
    void buildDough(); // Construire la pâte
    void buildSauce(); // Construire la sauce
    void buildToppings(); // Construire les garnitures
    Pizza getPizza(); // Obtenir la pizza
}
