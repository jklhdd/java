/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
/**
 *
 * @author Long
 */
public class UserController {
    public TextField name = new TextField();
    public TextField age = new TextField();
    public TextField email = new TextField();
    public TextArea address = new TextArea();    
    
    
    public void listUser(){
        try{
        String n = name.getText();
        String em = email.getText();
        Integer a ;
        try{
            a=Integer.parseInt(age.getText());
        }catch(Exception e){
            a=0;
        }
        String add = address.getText();
        Parent listuser = FXMLLoader.load(getClass().getResource("listuser.fxml"));
        JavaFXApplication3.mainStage.getScene().setRoot(listuser);
        User u = new User(n, a, em, add);
        ListUser.List.add(u);
        } catch(Exception e){
                System.out.println("aa");
        }
    }
    
    
}
