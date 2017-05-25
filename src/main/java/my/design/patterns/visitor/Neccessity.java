package my.design.patterns.visitor;

/**
 * Created by sangamesh on 5/25/17.
 */
public class Neccessity implements Visitable {


    private double price;

    public Neccessity(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double apply(Visitor visitor) {
        return visitor.visit(this);
    }
}
