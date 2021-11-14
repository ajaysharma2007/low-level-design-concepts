package oops.SOLID.openClosePrinciple.before.taxes.impl;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class InternTaxCalculator implements TaxCalculator {
    private final int INCOME_TAX_PERCENTAGE = 15;

    @Override
    public double calculate(Employee employee) {
        double incomeTax = 0;
        if (employee.getMonthlyIncome() >= 300000) {
            incomeTax = (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE);
        }

        return incomeTax;
    }
}
