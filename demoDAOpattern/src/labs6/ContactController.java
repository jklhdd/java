/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

import demodaopattern.DataAccessObjectContact;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.sql.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;



/**
 *
 * @author Long
 */
public class ContactController implements Initializable{
    public ListView<Contact> listcontact = new ListView<>();
    //public static int selectID;
    public static int detail;
    public static Parent view;
    private static ContactController instance;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(instance == null){
            instance = this;
        }
    }
    public void findContact(){
        detail = listcontact.getSelectionModel().getSelectedItem().getId();
        try {
            if(view == null){
                view = FXMLLoader.load(getClass().getResource("number.fxml"));
            }
            NumberController.render();
            Labs6.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }  
    
    public static void render(){
        try {
            ObservableList<Contact> list  = FXCollections.observableArrayList();
            DataAccessObjectContact daoc = new DataAccessObjectContact();
            list.addAll(daoc.read());
            instance.listcontact.setItems(list);

        }catch (Exception e){
            System.out.println("a");
        }
    }
    
    public void addContact(){
        try {
            Parent form  = FXMLLoader.load(getClass().getResource("addcontact.fxml"));
            Labs6.mainStage.getScene().setRoot(form);
        }catch (Exception e){}
    }
}
