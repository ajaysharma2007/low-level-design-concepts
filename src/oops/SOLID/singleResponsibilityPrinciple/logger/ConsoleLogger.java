package oops.SOLID.singleResponsibilityPrinciple.logger;

public class ConsoleLogger implements Logger{
    public  void writeInfo( String info) {
        System.out.println(info);
    }

    public  void writeError( String err) {
        System.err.println(err);
    }
}
