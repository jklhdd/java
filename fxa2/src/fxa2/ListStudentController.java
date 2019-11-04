/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxa2;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("liststudent.fxml"));
        
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        score.setCellValueFactory(new PropertyValueFactory<>("diem"));
        
        ObservableList<Student> List = FXCollections.observableArrayList();
        List.addAll(readfile());        
        table.setItems(List);
    
    
    }
    public ArrayList<Student> readfile(){
        ArrayList<Student> arr= new ArrayList<>();
        String ftxt= "";
        File f = new File("C:/Users/Long/Documents/Demo.txt");
        

        if (f.canRead()){
            try{
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
//                System.out.println(dis.readLine());
                String line= "";
                while ((line = dis.readLine()) !=null){
                    ftxt += line+"\n";
//                    System.out.println(line);
                    String[] strs = line.split("-");
                    Student s = new Student(strs[0],Integer.parseInt(strs[1]),Integer.parseInt(strs[2]));
                    arr.add(s);
                    
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        return arr;
    }
    
    public void addStudent(){
        try{
        Parent newuser = FXMLLoader.load(getClass().getResource("newstudent.fxml"));
        Fxa2.mainStage.getScene().setRoot(newuser);
        } catch(Exception e){
                System.out.println("Error!");
        }
    }
}
