package oops.SOLID.openClosePrinciple.before.factory.impl.taxfactory;

import oops.SOLID.openClosePrinciple.before.factory.TaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.taxes.impl.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class InternTaxCalculatorFactory extends TaxCalculatorFactory {
    private static TaxCalculator taxCalculator;
    public static TaxCalculator getInstance() {
        if(taxCalculator == null) {
            taxCalculator = new InternTaxCalculator();
        }

        return taxCalculator;
    }
}
