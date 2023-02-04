package com.fipek.playground.solid.singleresponsiblity;

public class Employee {
    // Response to change: Changes in Employee Attributes

    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contractNumber;
    private String employeeType;

    public void save() {
        new EmployeeRepository().save(this);
    }

    public void calculateTax() {
        new TaxCalculator().calculateTax(this);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
