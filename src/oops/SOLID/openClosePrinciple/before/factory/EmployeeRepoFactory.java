package oops.SOLID.openClosePrinciple.before.factory;

import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.persistence.impl.StringEmployeeRepository;

public class EmployeeRepoFactory {
    private  static  EmployeeRepository employeeRepository;

    public static EmployeeRepository getInstance(String type) {
        if(employeeRepository  == null) {
            if (type.equals("String")) {
                employeeRepository = new StringEmployeeRepository();
            }
        }
        return employeeRepository;
    }
}
