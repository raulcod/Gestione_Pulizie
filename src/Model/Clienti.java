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
public class Clienti {

    private final IntegerProperty IDCliente;
    private final IntegerProperty IdReferentiClienti;
    private final StringProperty NomeCliente;
    private final StringProperty Indirizzo;
    private final StringProperty Citta;
    private final StringProperty Prov;
    private final StringProperty Cap;
    private final StringProperty CodFisc;
    private final StringProperty PIVA;
    private final StringProperty Email;
    private final StringProperty Telefono;
    private final StringProperty Cellulare;
   // private final ObjectProperty<LocalDate> birthday;

    /**
     * Default constructor.
     */
    
    public Clienti() {
        this(null,null,null,null,null,null,null,null,null,null,null,null);
    }
    
    
    public Clienti(Integer IDCliente,Integer IdReferentiClienti,String NomeCliente, String Indirizzo,String Citta,
    String Prov,String Cap,String CodFisc,String PIVA, String Email,
    String Telefono,String Cellulare) {
        
        this.IDCliente = new SimpleIntegerProperty(IDCliente);
        this.IdReferentiClienti = new SimpleIntegerProperty(IdReferentiClienti);
        this.NomeCliente = new SimpleStringProperty(NomeCliente);
        this.Indirizzo = new SimpleStringProperty(Indirizzo);
        this.Citta = new SimpleStringProperty(Citta);
        this.Prov = new SimpleStringProperty(Prov);
        this.Cap = new SimpleStringProperty(Cap);
        this.CodFisc = new SimpleStringProperty(CodFisc);
        this.PIVA = new SimpleStringProperty(PIVA);
        this.Email = new SimpleStringProperty(Email);
        this.Telefono = new SimpleStringProperty(Telefono);
        this.Cellulare = new SimpleStringProperty(Cellulare);      
        //this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public int getIDCliente() {
        return IDCliente.get();
    }
    public void setIDCliente(int IDCliente) {
        this.IDCliente.set(IDCliente);
    }
    public IntegerProperty IDClienteProperty() {
        return IDCliente;
    }
    
        
        public int getIdReferentiClienti() {
        return IdReferentiClienti.get();
    }
    public void setIdReferentiClienti(int IdReferentiClienti) {
        this.IdReferentiClienti.set(IdReferentiClienti);
    }
    public IntegerProperty IdReferentiClientiProperty() {
        return IdReferentiClienti;
    }
    
        
    public String getNomeCliente() {
        return NomeCliente.get();
    }
    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente.set(NomeCliente);
    }
    public StringProperty NomeClienteProperty() {
        return NomeCliente;
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
    
    
    public String Cellulare() {
        return Cellulare.get();
    }
    public void setCellulare(String Cellulare) {
        this.Cellulare.set(Cellulare);
    }
    public StringProperty CellulareProperty() {
        return Cellulare;
    }

  }