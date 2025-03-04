package net.smileyzone;

import java.util.Objects;

public class Employee extends Person {
    private String ssn;
    private Double salary;
    private int year;
    public Employee(String name, String ssn, Double salary, int year) {
        this.salary = salary; this.ssn = ssn; this.year = year;
        super.setName(name);
    }

    public String toString(Employee other) {
        String compare = (ssn.equals(other.getSSN())) ? "\n\nis the same person as\n\n" : "\n\nis not the same person as\n\n";
        return this+compare+other;
    }

    public String toString() {
        return "Name: "+getName()+"\nSSN: "+ssn+"\nSalary: "+salary+"\nYear of Hire: "+year+"\n";
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getSSN() { return ssn; }
    public Double getSalary() { return salary; }
    public int getYear() { return year; }
}
