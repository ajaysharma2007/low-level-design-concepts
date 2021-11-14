package oops.SOLID.singleResponsibilityPrinciple.factory;

import oops.SOLID.singleResponsibilityPrinciple.logger.ConsoleLogger;
import oops.SOLID.singleResponsibilityPrinciple.logger.Logger;
import oops.SOLID.singleResponsibilityPrinciple.repository.EmployeeRepository;
import oops.SOLID.singleResponsibilityPrinciple.repository.StringEmployeeRepository;

public class LoggerFactory {
    private static Logger logger;

    public static Logger getInstance(String type) {
        if(logger  == null) {
            if(type.equals("Console")) {
                logger = new ConsoleLogger();
            }
        }
        return logger;
    }
}
