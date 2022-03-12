package Task01;

public class ReadymadeCake extends Cake{

    public int quantity;

    public ReadymadeCake(String n, double r, int c) {
        super(n,r);
        quantity= c;
    }

    @Override
    public double calcPrice() {

        double price =rate*quantity;

        return price;
    }
}
