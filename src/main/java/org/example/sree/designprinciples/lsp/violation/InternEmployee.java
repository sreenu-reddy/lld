package org.example.sree.designprinciples.lsp.violation;

public class InternEmployee extends Employee{
    protected InternEmployee(Long employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println(" Calculating intern salary ....");
        return 0;
    }
}
