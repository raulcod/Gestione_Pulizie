/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Database.DBManager;
 
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class UserDAO {
 
    
 
    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static User getUserFromResultSet(ResultSet rs) throws SQLException
    {
        User _user = null;
        if (rs.next()) {
            _user = new User();
            _user.setUserIdProperty(rs.getInt("IDUtente"));
            _user.setFirstName(rs.getString("UserName"));
            _user.setLastName(rs.getString("Password"));
            //_user.setEmail(rs.getString("EMAIL"));
            //_user.setLastLogin(rs.getDate("PHONE_NUMBER"));
            
        }
        return _user;
    }
    
    //*******************************
    //SELECT an Employee
    //*******************************
    public static User searchUser (String usrId) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM tblutenti WHERE IDUtente="+usrId;
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsUser = DBManager.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            User _user = getUserFromResultSet(rsUser);
 
            //Return employee object
            return _user;
        } catch (SQLException e) {
            System.out.println("While searching an employee with " + usrId + " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }
 
    
     //Select * from employees operation
    private static ObservableList<User> getUserList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Employee objects
        ObservableList<User> userList = FXCollections.observableArrayList();
 
        while (rs.next()) {
            User usr = new User();
            usr.setUserIdProperty(rs.getInt("IDUtente"));
            usr.setFirstName(rs.getString("FIRST_NAME"));
            usr.setLastName(rs.getString("FIRST_NAME"));
            usr.setPassword(rs.getString("Password"));
            usr.setEmail(rs.getString("Email"));
            
            //emp.setFirstName(rs.getString("FIRST_NAME"));
            //emp.setLastName(rs.getString("LAST_NAME"));
            //emp.setEmail(rs.getString("EMAIL"));
            //emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
            //emp.setHireDate(rs.getDate("HIRE_DATE"));
            //emp.setJobId(rs.getString("JOB_ID"));
            //emp.setSalary(rs.getInt("SALARY"));
            //emp.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
            //emp.setManagerId(rs.getInt("MANAGER_ID"));
            //emp.setDepartmantId(rs.getInt("DEPARTMENT_ID"));
            //Add employee to the ObservableList
            userList.add(usr);
        }
        //return empList (ObservableList of Employees)
        return userList;
    }
 
    
    
    
    //*******************************
    //SELECT Employees
    //*******************************
    public static ObservableList<User> searchUser () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM tblUtenti";
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsUser = DBManager.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<User> empList = getUserList(rsUser);
 
            //Return employee object
            return empList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }
 
   
    //*************************************
    //UPDATE an employee's email address
    //*************************************
    public static void updateEmpEmail (String empId, String empEmail) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        String updateStmt =
                "BEGIN\n" +
                        "   UPDATE employees\n" +
                        "      SET EMAIL = '" + empEmail + "'\n" +
                        "    WHERE EMPLOYEE_ID = " + empId + ";\n" +
                        "   COMMIT;\n" +
                        "END;";
 
        //Execute UPDATE operation
        try {
            DBManager.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }
 
    //*************************************
    //DELETE an employee
    //*************************************
    public static void deleteEmpWithId (String empId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "   DELETE FROM employees\n" +
                        "         WHERE employee_id ="+ empId +";\n" +
                        "   COMMIT;\n" +
                        "END;";
 
        //Execute UPDATE operation
        try {
            DBManager.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
 
    //*************************************
    //INSERT an employee
    //*************************************
    public static void insertEmp (String name, String lastname, String email) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "INSERT INTO employees\n" +
                        "(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)\n" +
                        "VALUES\n" +
                        "(sequence_employee.nextval, '"+name+"', '"+lastname+"','"+email+"', SYSDATE, 'IT_PROG');\n" +
                        "END;";
 
        //Execute DELETE operation
        try {
            DBManager.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
}