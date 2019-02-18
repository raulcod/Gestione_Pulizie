/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author kjpsaycon
 */
public class Employes implements Serializable {
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty address = new SimpleStringProperty();
    private final ObjectProperty<Date> birthDate = new SimpleObjectProperty<>();
    private String dateFormat;

    public  Employes() {
        
    }
   

    public String getId() {
        return id.get();
    }

    public void setId(String value) {
        id.set(value);
    }

    public StringProperty idProperty() {
        return id;
    }
   
    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }
   
    public String getAddress() {
        return address.get();
    }

    public void setAddress(String value) {
        address.set(value);
    }
   
    public StringProperty addressProperty() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate.get();
    }

    public void setBirthDate(Date value) {
        birthDate.set(value);
    }

    public ObjectProperty BirthDateProperty() {
        return birthDate;
    }
   
    public String getDateFormat() {
        Date date = getBirthDate();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        String format = df.format(date);
        return format;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString() {
        return "Employes_ID =" + this.getId() + ", Nome=" + Employes.this.getName() + ", indirizzo=" + this.getAddress()+ ", compleanno=" + this.getDateFormat() ;
    }

   
}
