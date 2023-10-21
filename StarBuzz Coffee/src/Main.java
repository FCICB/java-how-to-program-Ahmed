public class Main {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        Beverage beverage1=new HouseBlend();
        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        beverage=new Whipe(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        beverage1=new Mocha(beverage1);
        beverage1=new Whipe(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
    }
}