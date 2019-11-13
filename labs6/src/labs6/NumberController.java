/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 *
 * @author Long
 */
public class NumberController implements Initializable{
    public ListView<Number> numberlist = new ListView<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Connector connector  = Connector.getInstance();           
            String sql = "SELECT * FROM phonenumber WHERE contact_id = "+ContactController.detail.getId()+";";           
            
            ResultSet rs = connector.getQuery(sql);            
            ObservableList<Number> List = FXCollections.observableArrayList();
            
            while(rs.next()){
               List.add(new Number(rs.getInt("number"), rs.getInt("type"), rs.getInt("contact_id"))); 
            }
            
            numberlist.setItems(List);            
        }catch(Exception ex){
            
        }
    }
    
}
