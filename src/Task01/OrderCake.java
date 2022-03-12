package Task01;

public class OrderCake extends Cake{

    public double weight;

    public OrderCake(String n, double r,double w) {
        super(n,r);
        weight= w;
    }

    @Override
    public double calcPrice() {

        double price =rate*weight;

        return price;
    }
}
