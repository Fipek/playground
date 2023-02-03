package com.fipek.playground.solid.singleresponsiblity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeBadVersion {

    // This is bad code. Low cohesion and tightly coupled.
    // We changed it according to single responsibility principle.

    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contractNumber;
    private String employeeType;

    public void save() {
        // Serialize object into a string representation
        String objectStr = null;//MyUtils.serializeIntoAString(this);
        Connection connection = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO EMPLOYEE VALUES (" + objectStr + ")");
        } catch(Exception e){
          e.printStackTrace();
        }
    }

    public void calculateTax() {
        if(this.getEmployeeType().equals("fulltime")){
            // Tax calc for full time employee
        }
        if(this.getEmployeeType().equals("contract")){
            // Tax calc for contractors
        }
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
