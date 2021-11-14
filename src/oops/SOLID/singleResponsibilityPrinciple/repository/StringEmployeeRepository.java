package oops.SOLID.singleResponsibilityPrinciple.repository;

import oops.SOLID.singleResponsibilityPrinciple.before.Employee;
import oops.SOLID.singleResponsibilityPrinciple.before.FullTimeEmployee;
import oops.SOLID.singleResponsibilityPrinciple.before.PartTimeEmployee;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class StringEmployeeRepository implements EmployeeRepository {

    @Override
    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }

    @Override
    public void save(Employee employee) throws IOException {
        StringBuilder serializedEmp = employee.serialize();
        String message = "Saved employee successfully : " + employee.toString();
        Files.write(employee.getSavePath(), serializedEmp.toString().getBytes());
    }
}