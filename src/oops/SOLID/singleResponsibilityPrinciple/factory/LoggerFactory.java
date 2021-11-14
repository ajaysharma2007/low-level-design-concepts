package oops.SOLID.singleResponsibilityPrinciple.factory;

import oops.SOLID.singleResponsibilityPrinciple.logger.impl.ConsoleLogger;
import oops.SOLID.singleResponsibilityPrinciple.logger.Logger;

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
