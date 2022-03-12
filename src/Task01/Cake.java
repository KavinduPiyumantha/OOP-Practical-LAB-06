package Task01;

public abstract class Cake {

    protected String name;
    protected double rate; // rate for 1 kg or 1 quantity

    public Cake(String n, double r){
        name =n;
        rate = r;
    }

    public abstract double calcPrice();


    public String toString(){

        return  name +"\t"+rate;
    }
}


