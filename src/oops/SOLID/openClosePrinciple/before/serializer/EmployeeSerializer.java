package oops.SOLID.openClosePrinciple.before.serializer;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public interface EmployeeSerializer {
    StringBuilder serialize(Employee employee);
}
