package oops.SOLID.openClosePrinciple.before.factory.impl.serializer;

import oops.SOLID.openClosePrinciple.before.factory.EmployeeSerializerFactory;
import oops.SOLID.openClosePrinciple.before.serializer.EmployeeSerializer;
import oops.SOLID.openClosePrinciple.before.serializer.impl.EmployeeSerializerHrFormat;

public class HrEmployeeSerializerFactory extends EmployeeSerializerFactory {
    private static EmployeeSerializer employeeSerializer;

    public static EmployeeSerializer getInstance() {
        if(employeeSerializer == null) {
            employeeSerializer = new EmployeeSerializerHrFormat();
        }
        return employeeSerializer;
    }
}
