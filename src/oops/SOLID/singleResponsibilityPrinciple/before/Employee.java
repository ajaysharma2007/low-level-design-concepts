package oops.SOLID.singleResponsibilityPrinciple.before;

import oops.SOLID.singleResponsibilityPrinciple.serializer.EmployeeSerializer;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
Models an employee form a business perspective
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

    private EmployeeSerializer employeeSerializer;
    private EmployeeRepository employeeRepository;

    public Employee(String fullName, int monthlyIncome) {
        setMonthlyIncome(monthlyIncome);

        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getEmail() {
        return this.firstName + "." +
                this.lastName +
                "@globomanticshr.com";
    }

    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName + " - " +
                this.monthlyIncome;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        if (monthlyIncome < 0) {
            throw new IllegalArgumentException("Income must be positive");
        }

        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        if (nbHoursPerWeek <= 0) {
            throw new IllegalArgumentException("Income must be positive");
        }

        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public StringBuilder serialize() {
        return employeeSerializer.serialize(this);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public Path getSavePath() {
        return Paths.get(this.getFullName().replace(" ", "_") + ".rec");
    }

    public void save() {
        String savedMessage = employeeRepository.save(this);
        System.out.println(savedMessage);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeSerializer(EmployeeSerializer employeeSerializer) {
        this.employeeSerializer = employeeSerializer;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
