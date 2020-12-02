public class WhippedCream extends CondimentDecorator{

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return .99 + beverage.cost();
    }
}
