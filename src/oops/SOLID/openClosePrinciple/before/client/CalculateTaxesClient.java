package oops.SOLID.openClosePrinciple.before.client;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.factory.EmployeeRepoFactory;
import oops.SOLID.openClosePrinciple.before.factory.TaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.formatter.TaxFormatter;
import oops.SOLID.openClosePrinciple.before.formatter.impl.LocaleTaxFormatter;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

import java.util.List;


public class CalculateTaxesClient {
    public static void main(String[] args) {
        TaxFormatter taxFormatter = new LocaleTaxFormatter("en", "US");
        EmployeeRepository repository = EmployeeRepoFactory.getInstance("String");
        List<Employee> employees = repository.findAll();

        double totalTaxes = 0;
        for (Employee employee: employees){
            TaxCalculator taxCalculator = TaxCalculatorFactory.getInstance(employee);
            double tax = taxCalculator.calculate(employee);
            String formattedTax = taxFormatter.format(tax);
            totalTaxes += taxCalculator.calculate(employee);
        }
    }
}
