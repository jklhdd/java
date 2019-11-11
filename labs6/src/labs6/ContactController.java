/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.sql.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;



/**
 *
 * @author Long
 */
public class ContactController implements Initializable{
    public ListView<Contact> listcontact = new ListView<>();
    public static int selectID;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("contact.fxml"));
            Connection conn = DriverManager.getConnection(Labs6.url, Labs6.username, Labs6.password);
            Statement stm = conn.createStatement();            
            String sql = "SELECT * FROM contact";            
            ResultSet rs = stm.executeQuery(sql);
            
            ObservableList<Contact> List = FXCollections.observableArrayList();
            while(rs.next()){
               List.add(new Contact(rs.getInt("id"), rs.getString("name"), rs.getString("company"), rs.getString("address"))); 
            }
            
            listcontact.setItems(List);
            
        }catch(Exception ex){
            
        }
    }
    public void findContact(){
        try{
        selectID = listcontact.getSelectionModel().getSelectedItem().getId();
        Parent number = FXMLLoader.load(getClass().getResource("number.fxml"));
        
        Labs6.mainstage.getScene().setRoot(number);
        } catch(Exception e){
                System.out.println("Error!");
        }
    }  
    
    
}
