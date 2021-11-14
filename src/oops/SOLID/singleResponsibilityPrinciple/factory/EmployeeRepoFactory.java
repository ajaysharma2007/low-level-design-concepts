package oops.SOLID.singleResponsibilityPrinciple.factory;

import oops.SOLID.singleResponsibilityPrinciple.repository.EmployeeRepository;
import oops.SOLID.singleResponsibilityPrinciple.repository.StringEmployeeRepository;

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
