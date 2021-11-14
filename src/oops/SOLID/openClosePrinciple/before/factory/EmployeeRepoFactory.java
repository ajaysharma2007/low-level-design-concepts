package oops.SOLID.openClosePrinciple.before.factory;

import oops.SOLID.openClosePrinciple.before.factory.impl.repo.StringEmployeeRepoFactory;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;

public class EmployeeRepoFactory {
    private static EmployeeRepository employeeRepository;

    public static EmployeeRepository getInstance(String type) {
        if (type.equals("String")) {
            employeeRepository = StringEmployeeRepoFactory.getInstance();
        }

        return employeeRepository;
    }
}
