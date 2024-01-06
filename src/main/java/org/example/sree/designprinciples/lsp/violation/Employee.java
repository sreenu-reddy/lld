package org.example.sree.designprinciples.lsp.violation;

public abstract class Employee {
    protected final Long employeeId;

    protected Employee(Long employeeId){
        this.employeeId=employeeId;
    }
    protected abstract double calculateSalary();
}
