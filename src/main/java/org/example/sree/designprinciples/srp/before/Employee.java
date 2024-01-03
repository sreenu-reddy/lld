package org.example.sree.designprinciples.srp.before;


public class Employee {
    private Long id;

    public Employee(Long id){
        this.id =id;
    }

    public long getEmployeeId(){
        return this.id;
    }

    /**
     *  Calculate salary of an employee
     * */

    public double calculateSalary(){
        return 0.;
    }

    /**
     *  Print  performance report of an employee in a certain format
     * */

    public String printPerformanceReport(){
        return "";
    }

    /**
     * Get BioData of an employee
     * */

    public String getBioData(){
        return "";
    }
}
