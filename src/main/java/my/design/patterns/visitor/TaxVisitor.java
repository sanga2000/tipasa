package my.design.patterns.visitor;

/**
 * Created by sangamesh on 5/25/17.
 */
public class TaxVisitor implements  Visitor {
    @Override
    public double visit(Liquor liquor) {
        return liquor.getPrice() * .32;
    }

    @Override
    public double visit(Tobacco tobacco) {
        return tobacco.getPrice() * .40;
    }

    @Override
    public double visit(Neccessity neccessity) {
        return neccessity.getPrice() * 0;
    }
}
