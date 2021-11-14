package oops.SOLID.singleResponsibilityPrinciple.serializer;

import oops.SOLID.singleResponsibilityPrinciple.before.Employee;

public interface EmployeeSerializer {
    StringBuilder serialize(Employee employee);
}
