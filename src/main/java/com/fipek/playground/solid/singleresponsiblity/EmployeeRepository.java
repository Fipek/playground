package com.fipek.playground.solid.singleresponsiblity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {

    public void save(Employee employee) {
        // Serialize object into a string representation
        String objectStr = null;//MyUtils.serializeIntoAString(employee);
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
}
