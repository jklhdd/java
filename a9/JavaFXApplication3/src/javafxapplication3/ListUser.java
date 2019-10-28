/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author Long
 */
public class ListUser implements Initializable{
    public TableView<User> tableview = new TableView<>();
    public static ObservableList<User> List = FXCollections.observableArrayList();
    public TableColumn<User,String> name = new TableColumn<>();
    public TableColumn<User,Integer> age = new TableColumn<>();
    public TableColumn<User,String> email = new TableColumn<>();
    public TableColumn<User,String> address = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newuser.fxml"));
        UserController ucontrol = loader.getController();
        
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        
//        User u1 = new User("Long", 20, "toidayg", "HaNoi");
//        User u2 = new User("Long2", 20, "toidayg2", "HaNoi2");
//        
//        
//        List.add(u1);
//        List.add(u2);
        
        tableview.setItems(List);
        
    }
    
    public void addUser(){
        try{
        Parent newuser = FXMLLoader.load(getClass().getResource("newuser.fxml"));
        JavaFXApplication3.mainStage.getScene().setRoot(newuser);
        } catch(Exception e){
                System.out.println("aa");
        }
    }
    
    public void sortAZ(){
        Collections.sort(List, (User u1, User u2) -> u1.getName().compareTo(u2.getName()));
    }
    
    public void sortZA(){
        Collections.sort(List, (User u1, User u2) -> -u1.getName().compareTo(u2.getName()));
    }
    
}
