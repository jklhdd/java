/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

import demodaopattern.DataAccessObjectContact;
import demodaopattern.DataAccessObjectNumber;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

/**
 *
 * @author Long
 */
public class NumberController implements Initializable{
    public ListView<Number> numberlist = new ListView<>();
    
    private static NumberController instance;

    public Text txt = new Text();
    private String sql_txt = "SELECT * FROM phonenumber WHERE contact_id = ?";

    public static ObservableList<Number> list = FXCollections.observableArrayList();
    public static Integer detail_id = 0;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(instance == null){
            instance = this;
        }
    }
    public void back(){
        try {
            Labs6.mainStage.getScene().setRoot(Labs6.root);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void render(){
        if(detail_id != ContactController.detail){
            try {
                Connector connector = Connector.getInstance();
                String sql = "SELECT * FROM phonenumber WHERE contact_id ="+ContactController.detail;
                ResultSet rs = connector.getQuery(sql);
                list.clear();
                while (rs.next()){
                    Number p = new Number(rs.getInt("number"),rs.getInt("type"),rs.getInt("contact_id"));
                    list.add(p);
                }
                detail_id = ContactController.detail;

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        instance.numberlist.setItems(list);
    }
    
    public void deleteContact(){
        Contact c = new Contact(detail_id,null,null,null);
        DataAccessObjectNumber daoN = new DataAccessObjectNumber();
        for (Number p: list){
            daoN.delete(p);
        }
        DataAccessObjectContact daoC = new DataAccessObjectContact();
        daoC.delete(c);
        try {
            Labs6.mainStage.getScene().setRoot(Labs6.root);
            ContactController.render();
        }catch (Exception e){}
    }
}
