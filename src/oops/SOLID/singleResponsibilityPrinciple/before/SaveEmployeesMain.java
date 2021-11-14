package oops.SOLID.singleResponsibilityPrinciple.before;

import oops.SOLID.singleResponsibilityPrinciple.factory.EmployeeRepoFactory;
import oops.SOLID.singleResponsibilityPrinciple.factory.LoggerFactory;
import oops.SOLID.singleResponsibilityPrinciple.logger.Logger;
import oops.SOLID.singleResponsibilityPrinciple.repository.EmployeeRepository;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    private static EmployeeRepository employeeRepository;
    private static Logger logger;

    public static void main(String[] args) {
        employeeRepository = EmployeeRepoFactory.getInstance("String");
        logger = LoggerFactory.getInstance("Console");
        List<Employee> employees = employeeRepository.findAll();
        for (Employee employee : employees){
            try {
                employeeRepository.save(employee);
                logger.writeInfo("Saved employee : " + employee.toString() );
            } catch (IOException e) {
                logger.writeError("Failed to save employee : " + employee.toString());
                e.printStackTrace();
            }
        }
    }
}