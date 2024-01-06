package org.example.sree.designprinciples.lsp.violation;

import java.util.List;

public class SalaryDisburser {

    public void disburseSalaries(List<Employee> employees){
        for (Employee employee :employees) {
            if (employee instanceof Volunteer)
                continue;

            employee.calculateSalary();

            /**
             * some logic for disbursing the salaries......
             */

        }
    }
}
