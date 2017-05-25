package my.design.patterns.visitor;

/**
 * Created by sangamesh on 5/25/17.
 */
public interface Visitor {

    double visit (Liquor liquor);
    double visit (Tobacco tobacco);
    double visit (Neccessity neccessity);
}
