package oops.SOLID.openClosePrinciple.before.persistence;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void save(Employee employee) throws IOException;
}
