package org.example.sree.designprinciples.lsp.violation;

public class ContractEmployee extends Employee {
    protected ContractEmployee(Long employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating contract employee salary ....");
        return 0;
    }

}
