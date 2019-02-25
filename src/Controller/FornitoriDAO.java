/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author user
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Database.DBManager;
import Model.Fornitore;

 
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class FornitoriDAO {
 
     public static boolean ValidateFornitore (Fornitore _fo ) throws SQLException, ClassNotFoundException {
        boolean _checked=false;

 
        
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM tblfornitori "
            +" WHERE NomeFornitore ='" + _fo.getNomeFornitore()
             + "'" ;
 
        //Execute SELECT statement
        try {
            System.out.print(selectStmt);
            //Get ResultSet from dbExecuteQuery method
            _checked = DBManager.dbExecute(selectStmt);
            
        } catch (SQLException e) {
            System.out.println("While searching an employee with "
                +  _fo.getNomeFornitore() + " id, an error occurred: " + _fo.getIDFornitore());
            //Return exception
            throw e;
        }
        return _checked;
    }
    
    /*
           SELECT `tblfornitori`.`IDFornitore`,
    `tblfornitori`.`NomeFornitore`,
    `tblfornitori`.`Indirizzo`,
    `tblfornitori`.`Citta`,
    `tblfornitori`.`Prov`,
    `tblfornitori`.`Cap`,
    `tblfornitori`.`CodFisc`,
    `tblfornitori`.`PIVA`,
    `tblfornitori`.`Email`,
    `tblfornitori`.`Telefono`
    FROM `db_pulizie`.`tblfornitori`;
    */
 
    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static Fornitore getFornitoreFromResultSet(ResultSet rs) throws SQLException
    {
        Fornitore _fo = null;
        if (rs.next()) {
            _fo = new Fornitore();
            _fo.setIDFornitore(rs.getInt("IDFornitore"));
            _fo.setNomeFornitore(rs.getString("NomeFornitore"));
            _fo.setIndirizzo(rs.getString("Indirizzo"));
            _fo.setCitta(rs.getString("Citta"));
            _fo.setProv(rs.getString("Prov"));
            _fo.setCap(rs.getString("Cap"));
            _fo.setCodFisc(rs.getString("CodFisc"));
            _fo.setPIVA(rs.getString("PIVA"));
            _fo.setEmail(rs.getString("Email"));
            _fo.setTelefono(rs.getString("Telefono"));
            
            
            //_user.setEmail(rs.getString("EMAIL"));
            //_user.setLastLogin(rs.getDate("PHONE_NUMBER"));
            
        }
        return _fo;
    }
    
    //*******************************
    //SELECT an Employee
    //*******************************
    public static Fornitore searchFornitore (String _foId) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM tblutenti WHERE IDUtente="+_foId;
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsFornitore = DBManager.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            Fornitore _user = getFornitoreFromResultSet(rsFornitore);
 
            //Return employee object
            return _user;
        } catch (SQLException e) {
            System.out.println("While searching an employee with " + _foId + " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }
 
    
     //Select * from employees operation
    private static ObservableList<Fornitore> getFornitoreList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Employee objects
        ObservableList<Fornitore> fornitoreList = FXCollections.observableArrayList();
 
        while (rs.next()) {
            Fornitore _fo = new Fornitore();
           _fo.setIDFornitore(rs.getInt("IDFornitore"));
            _fo.setNomeFornitore(rs.getString("NomeFornitore"));
            _fo.setIndirizzo(rs.getString("Indirizzo"));
            _fo.setCitta(rs.getString("Citta"));
            _fo.setProv(rs.getString("Prov"));
            _fo.setCap(rs.getString("Cap"));
            _fo.setCodFisc(rs.getString("CodFisc"));
            _fo.setPIVA(rs.getString("PIVA"));
            _fo.setEmail(rs.getString("Email"));
            _fo.setTelefono(rs.getString("Telefono"));
            
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
            fornitoreList.add(_fo);
        }
        //return empList (ObservableList of Employees)
        return fornitoreList;
    }
 
    
    
    
    //*******************************
    //SELECT Employees
    //*******************************
    public static ObservableList<Fornitore> searchFornitore () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM tblUtenti";
 
        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsFornitore = DBManager.dbExecuteQuery(selectStmt);
 
            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<Fornitore> empList = getFornitoreList(rsFornitore);
 
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