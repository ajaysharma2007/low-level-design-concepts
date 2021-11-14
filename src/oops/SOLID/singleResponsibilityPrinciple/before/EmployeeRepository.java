package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }

    public String save(Employee employee) {
        StringBuilder serializedEmp = employee.serialize();
        String message = "Saved employee successfully : " + employee.toString();
        try {
            Files.write(employee.getSavePath(), serializedEmp.toString().getBytes());
        } catch (IOException e) {
            message = "Failed to save employee  : " + employee.toString();
            e.printStackTrace();
        }

        return message;
    }
}