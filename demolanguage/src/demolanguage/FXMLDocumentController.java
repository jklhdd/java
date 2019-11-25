/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolanguage;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Long
 */
public class FXMLDocumentController  {
    public Text title = new Text();
    public TextField username = new TextField();
    public TextField email = new TextField();
    public TextField pass = new TextField();
    public TextField cpass = new TextField();
    public RadioButton vn = new RadioButton();
    public RadioButton en = new RadioButton();
    
    public void changeLanguage(){
        ResourceBundle bundle = ResourceBundle.getBundle("demolanguage.Messages");
        Demolanguage.mainStage.setTitle(bundle.getString("stage_title"));
        title.setText(bundle.getString("title"));
        en.setText(bundle.getString("en"));
        vn.setText(bundle.getString("vn"));
    }
    
    public void langVN(){
        Locale.setDefault(new Locale("vi","VN"));
        this.unselectedButton();
        vn.setSelected(true);
        this.changeLanguage();
    }
    
    public void langEN(){
        
    }
      
    
}
