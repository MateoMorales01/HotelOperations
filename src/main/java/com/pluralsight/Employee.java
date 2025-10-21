package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private static final int REGULAR_HOURS_LIMIT = 40;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, REGULAR_HOURS_LIMIT);
    }
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - REGULAR_HOURS_LIMIT);
    }
    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        // Overtime is paid at time and a half
        double overTimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overTimePay;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
