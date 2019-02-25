/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.lang.Exception;
import Model.User;
import Controller.UserDAO;
import javafx.fxml.FXMLLoader;
 
/**
 *
 * @author Tino
 */
public class FXML_Login implements Initializable {
    
    @FXML
    private TextField textUserNameField;
    
    @FXML
    private PasswordField textPasswordField;
    
    
    
    Stage dialogStage = new Stage();
    Scene scene;
    
   
    @FXML
    private Label label;
 
    public FXML_Login() {
      
    }
     @FXML
    private Button buttonClick;
    
     
    @FXML   
    public void  handleButtonAction(ActionEvent event){
    User _usr = new User();
       boolean _userAuthenticaded=false;
       
        String UserName = textUserNameField.getText();
        String Password = textPasswordField.getText();
        _usr.setFirstName(UserName);
        _usr.setPassword(Password);
        
        try{
            _userAuthenticaded =UserDAO.ValidateUser(_usr);
            
            if (_userAuthenticaded==true){
                infoBox("Utente Loggato",null,"Success" );
                Node node = (Node)event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                    //System.out.println(getClass().toString());
                    //System.out.println("mytest path " + getClass().getResource("FXMLMenu.fxml") + " 1 " +
                    //getClass().getResource("Menu.fxml") + " 2 " 
                    //  );

                scene = new Scene(FXMLLoader.load(getClass().getResource("Menu.fxml")));
                dialogStage.setScene(scene);
                dialogStage.show();
            }
        }
        catch(Exception exe ){
            System.out.print(exe.getMessage());
        }
       
    } 
        
        /*
        
        
    
        String sql = "SELECT * FROM tblUtenti WHERE UserName = ? and Password = ?";
        
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, UserName);
            preparedStatement.setString(2, Password);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                infoBox("Entra con la tua username e la tua password", null, "Fallito");
            }else{
                infoBox("Utente Loggato",null,"Success" );
                Node node = (Node)event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                //System.out.println(getClass().toString());
                //System.out.println("mytest path " + getClass().getResource("FXMLMenu.fxml") + " 1 " +
                //getClass().getResource("Menu.fxml") + " 2 " 
                //  );
                
                scene = new Scene(FXMLLoader.load(getClass().getResource("Menu.fxml")));
                
                dialogStage.setScene(scene);
                dialogStage.show();
            }
        }
        catch(Exception e){
            e.printStackTrace();
           //System.out.print( getClass().getResource("Menu.fxml"));
        }
         //System.out.print("mytest path" + getClass().getResource("Menu.fxml").toString());
        */
    
    
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Alert alert = new Alert(AlertType.CONFIRMATION);
        
    }    
    
}