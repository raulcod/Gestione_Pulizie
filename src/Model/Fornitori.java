/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Clienti.
 *
 * @author Marco Jakob
 */
public class Fornitori {

    private final IntegerProperty IDFornitore;
    private final StringProperty NomeFornitore;
    private final StringProperty Indirizzo;
    private final StringProperty Citta;
    private final StringProperty Prov;
    private final StringProperty Cap;
    private final StringProperty CodFisc;
    private final StringProperty PIVA;
    private final StringProperty Email;
    private final StringProperty Telefono;
    // private final ObjectProperty<LocalDate> birthday;

    /**
     * Default constructor.
     */
    
    public Fornitori() {
        this(null,null,null,null,null,null,null,null,null,null);
    }
    
    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Fornitori(Integer IDFornitore,String NomeFornitore, String Indirizzo,String Citta,
    String Prov,String Cap,String CodFisc,String PIVA, String Email,String Telefono) {
        this.IDFornitore = new SimpleIntegerProperty(IDFornitore);
        this.NomeFornitore = new SimpleStringProperty(NomeFornitore);
        this.Indirizzo = new SimpleStringProperty(Indirizzo);
        this.Citta = new SimpleStringProperty(Citta);
        this.Prov = new SimpleStringProperty(Prov);
        this.Cap = new SimpleStringProperty(Cap);
        this.CodFisc = new SimpleStringProperty(CodFisc);
        this.PIVA = new SimpleStringProperty(PIVA);
        this.Email = new SimpleStringProperty(Email);
        this.Telefono = new SimpleStringProperty(Telefono);
        //this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public int getIDFornitore() {
        return IDFornitore.get();
    }
    public void setIDFornitore(int IDFornitore) {
        this.IDFornitore.set(IDFornitore);
    }
    public IntegerProperty IDFornitoreProperty() {
        return IDFornitore;
    }
       
        
    public String getNomeFornitore() {
        return NomeFornitore.get();
    }
    public void setNomeFornitore(String NomeFornitore) {
        this.NomeFornitore.set(NomeFornitore);
    }
    public StringProperty NomeFornitoreProperty() {
        return NomeFornitore;
    }

        
    public String getIndirizzo () {
        return Indirizzo.get();
    }
    public void setIndirizzo (String Indirizzo ) {
        this.Indirizzo.set(Indirizzo );
    }
    public StringProperty IndirizzoProperty() {
        return Indirizzo ;
    }
   
        
    public String getCitta () {
        return Citta.get();
    }
    public void setCitta (String Citta ) {
        this.Citta.set(Citta );
    }
    public StringProperty CittaProperty() {
        return Citta ;
    }
    
        
    public String getProv () {
        return Prov.get();
    }
    public void setProv (String Prov ) {
        this.Prov.set(Prov );
    }
    public StringProperty ProvProperty() {
        return Prov;
    }
    
    
    public String getCap() {
        return Cap.get();
    }
    public void setCap(String Cap) {
        this.Cap.set(Cap);
    }
    public StringProperty CapProperty() {
        return Cap;
    }
    
    
    public String CodFisc() {
        return CodFisc.get();
    }
    public void setCodFisc(String CodFisc) {
        this.CodFisc.set(CodFisc);
    }
    public StringProperty CodFiscProperty() {
        return CodFisc;
    }
    
    
    public String PIVA() {
        return PIVA.get();
    }
    public void setPIVA(String PIVA) {
        this.PIVA.set(PIVA);
    }
    public StringProperty PIVAProperty() {
        return PIVA;
    }
    
    
    public String Email() {
        return Email.get();
    }
    public void setEmail(String Email) {
        this.Email.set(Email);
    }
    public StringProperty EmailProperty() {
        return Email;
    }
    
    
    public String Telefono() {
        return Telefono.get();
    }
    public void setTelefono(String Telefono) {
        this.Telefono.set(Telefono);
    }
    public StringProperty TelefonoProperty() {
        return Telefono;
    }
    
}