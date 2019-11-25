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
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;



/**
 *
 * @author Long
 */
public class ContactController implements Initializable{
    public ListView<Contact> listcontact = new ListView<>();
    //public static int selectID;
    public static Contact detail;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            
//            Connection conn = DriverManager.getConnection(Labs6.url, Labs6.username, Labs6.password);
//            Statement stm = conn.createStatement();    
            
            Connector connector = Connector.getInstance();
            String sql = "SELECT * FROM contact";            
            ResultSet rs = connector.getQuery(sql);
            
            ObservableList<Contact> List = FXCollections.observableArrayList();
            while(rs.next()){
               List.add(new Contact(rs.getInt("id"), rs.getString("name"), rs.getString("company"), rs.getString("address"))); 
            }
            listcontact.setItems(List);
            
        }catch(Exception ex){
            
        }
    }
    public void findContact(){
        detail = listcontact.getSelectionModel().getSelectedItem();
        try{
            Parent number = FXMLLoader.load(getClass().getResource("number.fxml"));
            Labs6.mainstage.getScene().setRoot(number);
        } catch(Exception e){
                System.out.println("Error!");
        }
    }  
    
    
}
