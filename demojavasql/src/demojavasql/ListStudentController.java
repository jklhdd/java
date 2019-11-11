/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavasql;
import static demojavasql.Demojavasql.password;
import static demojavasql.Demojavasql.url;
import static demojavasql.Demojavasql.username;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 *
 * @author Long
 */
public class ListStudentController implements Initializable{
    public TableView<Student> table = new TableView<>();
    public TableColumn<Student,String> name = new TableColumn<>();
    public TableColumn<Student,Integer> age = new TableColumn<>();
    public TableColumn<Student,Integer> score = new TableColumn<>();
    public TextField sbyname = new TextField();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("liststudent.fxml"));
            
            Connection conn = DriverManager.getConnection(url, username, password);
            
            Statement stm = conn.createStatement();
            
            String sql = "SELECT * FROM student";
            
            ResultSet rs = stm.executeQuery(sql);
            
            name.setCellValueFactory(new PropertyValueFactory<>("name"));
            age.setCellValueFactory(new PropertyValueFactory<>("age"));
            score.setCellValueFactory(new PropertyValueFactory<>("diem"));
            
            ObservableList<Student> List = FXCollections.observableArrayList();
            while(rs.next()){
               Student s = new Student(rs.getString("st_name"), rs.getInt("age"), rs.getFloat("score"));
               List.add(s); 
            }            
            table.setItems(List);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListStudentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListStudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public void addStudent(){
        try{
        Parent newuser = FXMLLoader.load(getClass().getResource("newstudent.fxml"));
        Demojavasql.mainStage.getScene().setRoot(newuser);
        } catch(Exception e){
                System.out.println("Error!");
        }
    }
    public void findStudent(){
        try{
        Connection conn = DriverManager.getConnection(url, username, password);
        
        Statement stm = conn.createStatement();
            
        String sql = "SELECT * FROM student WHERE st_name = '"+sbyname.getText()+"'"+";";
            
        ResultSet rs = stm.executeQuery(sql);
        ObservableList<Student> list = FXCollections.observableArrayList();
        while(rs.next()){
               Student s = new Student(rs.getString("st_name"), rs.getInt("age"), rs.getFloat("score"));
               list.add(s); 
        }
        table.setItems(list);
        } catch(Exception e){
                System.out.println("Error!");
        }
    }
}
