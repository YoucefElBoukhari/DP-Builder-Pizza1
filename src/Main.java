public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        // Créez une pizza italienne.
        PizzaBuilder italianPizzaBuilder = new ItalianPizzaBuilder();
        director.constructPizza(italianPizzaBuilder);
        Pizza italianPizza = italianPizzaBuilder.getPizza();
        System.out.println("Pizza italienne : " + italianPizza);

        // Créez une pizza mexicaine.
        PizzaBuilder mexicanPizzaBuilder = new MexicanPizzaBuilder();
        director.constructPizza(mexicanPizzaBuilder);
        Pizza mexicanPizza = mexicanPizzaBuilder.getPizza();
        System.out.println("Pizza Mexicaine : " + mexicanPizza);
    }
}