package oops.SOLID.singleResponsibilityPrinciple.logger;

public interface Logger {
    void writeInfo(String info);
    void writeError(String err);
}
