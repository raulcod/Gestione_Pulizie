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
public class Cantieri {

    private final IntegerProperty IDCantiere;
    private final IntegerProperty IdCliente;
    private final StringProperty IntestazioneCantiere;
    private final StringProperty Indirizzo;
    private final StringProperty Citta;
    private final StringProperty Prov;
    private final StringProperty Cap;
    private final ObjectProperty<LocalDate> DataInizioCantiere;

    /**
     * Default constructor.
     */
    
    public Cantieri() {
        this(null,null,null,null,null,null,null,null);
    }
    
    
    public Cantieri(Integer IDCantiere,Integer IdCliente,String IntestazioneCantiere, String Indirizzo,String Citta,
    String Prov,String Cap,ObjectProperty<LocalDate> DataInizioCantiere) {
        
        this.IDCantiere = new SimpleIntegerProperty(IDCantiere);
        this.IdCliente = new SimpleIntegerProperty(IdCliente);
        this.IntestazioneCantiere = new SimpleStringProperty(IntestazioneCantiere);
        this.Indirizzo = new SimpleStringProperty(Indirizzo);
        this.Citta = new SimpleStringProperty(Citta);
        this.Prov = new SimpleStringProperty(Prov);
        this.Cap = new SimpleStringProperty(Cap);
        this.DataInizioCantiere = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public int getIDCantiere() {
        return IDCantiere.get();
    }
    public void setIDCantiere(int IDCantiere) {
        this.IDCantiere.set(IDCantiere);
    }
    public IntegerProperty IDCantiereProperty() {
        return IDCantiere;
    }
    
    
    
    public int getIdCliente() {
        return IdCliente.get();
    }
    public void setIdCliente(int IdCliente) {
        this.IdCliente.set(IdCliente);
    }
    public IntegerProperty IdClienteProperty() {
        return IdCliente;
    } 
       
    
        
    public String getIntestazioneCantiere() {
        return IntestazioneCantiere.get();
    }
    public void setIntestazioneCantiere(String IntestazioneCantiere) {
        this.IntestazioneCantiere.set(IntestazioneCantiere);
    }
    public StringProperty IntestazioneCantiereProperty() {
        return IntestazioneCantiere;
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
    
 
    public LocalDate getDataInizioCantiere() {
        return DataInizioCantiere.get();
    }
    public void setDataInizioCantiere(LocalDate DataInizioCantiere) {
        this.DataInizioCantiere.set(DataInizioCantiere);
    }
    public ObjectProperty<LocalDate> DataInizioCantiereProperty() {
        return DataInizioCantiere;
    }
}