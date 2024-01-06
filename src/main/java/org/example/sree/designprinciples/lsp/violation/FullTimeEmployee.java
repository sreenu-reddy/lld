package org.example.sree.designprinciples.lsp.violation;

public class FullTimeEmployee extends Employee{
    protected FullTimeEmployee(Long employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating FTE salary .....");
        return 0;
    }
}
