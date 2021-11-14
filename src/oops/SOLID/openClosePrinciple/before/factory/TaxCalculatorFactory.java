package oops.SOLID.openClosePrinciple.before.factory;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.factory.impl.taxfactory.FullTimeEmpTaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.factory.impl.taxfactory.InternTaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.factory.impl.taxfactory.PartTimeEmpTaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class TaxCalculatorFactory {
    private static TaxCalculator taxCalculator;

    public static TaxCalculator getInstance(Employee employee) {
        if(employee instanceof FullTimeEmployee) {
            taxCalculator =  FullTimeEmpTaxCalculatorFactory.getInstance();
        } else if( employee instanceof PartTimeEmployee) {
            taxCalculator = PartTimeEmpTaxCalculatorFactory.getInstance();
        } else if(employee instanceof Intern) {
            taxCalculator =  InternTaxCalculatorFactory.getInstance();
        }

        return taxCalculator;
    }
}
