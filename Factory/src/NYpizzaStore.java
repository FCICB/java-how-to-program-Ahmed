public class NYpizzaStore extends pizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYstyle();
        }
        return null;
    }
}
