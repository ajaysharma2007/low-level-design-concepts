package oops.SOLID.openClosePrinciple.before.factory;

import oops.SOLID.openClosePrinciple.before.serializer.EmployeeSerializer;
import oops.SOLID.openClosePrinciple.before.serializer.impl.EmployeeSerializerHrFormat;

public class EmployeeSerializerFactory {
    private static EmployeeSerializer employeeSerializer;

    public static EmployeeSerializer getInstance(String serializerType) {
       if(serializerType.equals("Hr")) {
           employeeSerializer = new EmployeeSerializerHrFormat();
       }
        return employeeSerializer;
    }
}
