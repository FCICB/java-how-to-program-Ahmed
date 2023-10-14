public class Main {
    public static void main(String[] args) {
        System.out.println("for mallard : ");
        MallardDuck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("for model: ");
        Duck model = new modelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}