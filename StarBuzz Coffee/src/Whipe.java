public class Whipe extends CondimentDecorator{
    Beverage beverage;
    public Whipe(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return beverage.cost()+.40;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Whipe";
    }
}
