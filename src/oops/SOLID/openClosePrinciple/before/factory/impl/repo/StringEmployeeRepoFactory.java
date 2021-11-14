package oops.SOLID.openClosePrinciple.before.factory.impl.repo;

import oops.SOLID.openClosePrinciple.before.factory.EmployeeRepoFactory;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.persistence.impl.StringEmployeeRepository;

public class StringEmployeeRepoFactory extends EmployeeRepoFactory {
    private  static  EmployeeRepository employeeRepository;

    public static EmployeeRepository getInstance() {
        if(employeeRepository  == null) {
                employeeRepository = new StringEmployeeRepository();
        }
        return employeeRepository;
    }
}
