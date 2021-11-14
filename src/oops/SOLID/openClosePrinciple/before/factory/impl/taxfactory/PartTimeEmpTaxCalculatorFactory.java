package oops.SOLID.openClosePrinciple.before.factory.impl.taxfactory;

import oops.SOLID.openClosePrinciple.before.factory.TaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.taxes.impl.PartTimeEmpTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class PartTimeEmpTaxCalculatorFactory extends TaxCalculatorFactory {

    private static TaxCalculator taxCalculator;
    public static TaxCalculator getInstance() {
        if(taxCalculator == null) {
            taxCalculator = new PartTimeEmpTaxCalculator();
        }

        return taxCalculator;
    }
}
