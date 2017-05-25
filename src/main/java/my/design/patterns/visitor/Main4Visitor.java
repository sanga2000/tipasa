package my.design.patterns.visitor;

/**
 * Created by sangamesh on 5/25/17.
 */
public class Main4Visitor {

    public static void main(String[] args) {
        Tobacco cigaratte = new Tobacco(11.99);
        Liquor vodka = new Liquor(30.35);
        Neccessity milk = new Neccessity(7.99);
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();
        System.out.println(cigaratte.apply(taxVisitor));
        System.out.println(vodka.apply(taxVisitor));
        System.out.println(milk.apply(taxVisitor));

        System.out.println(cigaratte.apply(taxHolidayVisitor));
        System.out.println(vodka.apply(taxHolidayVisitor));
        System.out.println(milk.apply(taxHolidayVisitor));

    }
}
