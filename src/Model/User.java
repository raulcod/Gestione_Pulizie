/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.time.LocalDate;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 * 
 */
public class User {
    //Declare Employees Table Columns
    private IntegerProperty _user_id;
    private StringProperty _first_name;
    private StringProperty _last_name;
    private StringProperty _password;
    private StringProperty _email;
    //private SimpleObjectProperty<Date> hire_date;
    private final ObjectProperty<LocalDate> _lastLogin;
 
    //Constructor
    public User() {
        this._user_id = new SimpleIntegerProperty();
        this._first_name = new SimpleStringProperty();
        this._last_name = new SimpleStringProperty();
        this._email = new SimpleStringProperty();
        //da sostituire con data corrente 
        this._lastLogin =  new SimpleObjectProperty<LocalDate>(LocalDate.now());
    }
    
    public User(StringProperty first_name, StringProperty last_name) {
        this._user_id = new SimpleIntegerProperty();
        this._first_name = first_name;
        this._last_name = last_name;
        this._email = new SimpleStringProperty();
        this._lastLogin =  new SimpleObjectProperty<>(LocalDate.now());
    }
    
 
    //employee_id
    public int getUserIdProperty() {
        return _user_id.get();
    }
 
    public void setUserIdProperty(int employeeId){
        this._user_id.set(employeeId);
    }
 
    public IntegerProperty userIdProperty(){
        return _user_id;
    }
 
    //first_name
    public String getFirstName () {
        return _first_name.get();
    }
 
    public void setFirstName(String firstName){
        this._first_name.set(firstName);
    }
 
    public StringProperty firstNameProperty() {
        return _first_name;
    }
 
    //last_name
    public String getLastName () {
        return _last_name.get();
    }
 
    public void setLastName(String lastName){
        this._last_name.set(lastName);
    }
 
    public StringProperty lastNameProperty() {
        return _last_name;
    }
 
     public String getPassword () {
        return _password.get();
    }
 
    public void setPassword(String password){
        this._password.set(password);
    }
 
    public StringProperty PasswordProperty() {
        return _password;
    }
    
    
    
    //email
    public String getEmail () {
        return _email.get();
    }
 
    public void setEmail (String email){
        this._email.set(email);
    }
 
    public StringProperty emailProperty() {
        return _email;
    }
    
    
    //hire_date
    public Object getLastLogin(){
        return _lastLogin.get();
    }
 
    public void setLastLogin(LocalDate lastLogin){
        this._lastLogin.set(lastLogin);
    }
 
    public ObjectProperty<LocalDate> LastLoginProperty(){
        return _lastLogin;
    }
    
 
  
}