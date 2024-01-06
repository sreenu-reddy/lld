package org.example.sree.designprinciples.lsp.violation;

import java.util.ArrayList;
import java.util.List;

public class SalaryDisburserSimulator {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee(1L));
        employees.add(new FullTimeEmployee(2L));
        employees.add(new InternEmployee(3L));
        employees.add(new Volunteer(5L));

        SalaryDisburser disburser = new SalaryDisburser();
        disburser.disburseSalaries(employees);
    }
}
