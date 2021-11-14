package oops.SOLID.singleResponsibilityPrinciple.repository;

import oops.SOLID.singleResponsibilityPrinciple.before.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void save(Employee employee) throws IOException;
}
