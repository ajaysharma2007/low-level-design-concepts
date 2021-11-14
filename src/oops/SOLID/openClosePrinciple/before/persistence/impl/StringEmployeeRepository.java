package oops.SOLID.openClosePrinciple.before.persistence.impl;

import oops.SOLID.openClosePrinciple.before.factory.EmployeeSerializerFactory;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.serializer.EmployeeSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        StringBuilder serializedEmp = EmployeeSerializerFactory.getInstance("Hr").serialize(employee);
        Files.write(Paths.get(employee.getFullName().replace(" ", "_") + ".rec"), serializedEmp.toString().getBytes());
    }
}