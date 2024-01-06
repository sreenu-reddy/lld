package org.example.sree.designprinciples.lsp.violation;

public class Volunteer extends Employee{
    protected Volunteer(Long employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        throw new RuntimeException("Salary can't be calculated for volunteer...");
    }
}
