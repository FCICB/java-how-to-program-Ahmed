
public class Main {
    public static void main(String[] args) {
        pizzaStore nyStore = new NYpizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }
}