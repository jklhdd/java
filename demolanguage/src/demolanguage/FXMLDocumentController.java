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
import javafx.scene.control.Button;
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
    public Button signin = new Button();
    
    public void changeLanguage(){
        ResourceBundle bundle = ResourceBundle.getBundle("demolanguage.Messages");
        Demolanguage.mainStage.setTitle(bundle.getString("stage_title"));
        title.setText(bundle.getString("title"));
        en.setText(bundle.getString("en"));
        vn.setText(bundle.getString("vn"));
        username.setPromptText(bundle.getString("name"));
        email.setPromptText(bundle.getString("email"));
        pass.setPromptText(bundle.getString("pass"));
        cpass.setPromptText(bundle.getString("cpass"));
        signin.setText(bundle.getString("signin"));
    }
    
    public void langVN(){
        Locale.setDefault(new Locale("vi","VN"));
        this.unselectedButton();
        vn.setSelected(true);
        this.changeLanguage();
    }
    
    public void langEN(){
        Locale.setDefault(Locale.US);
        this.unselectedButton();
        en.setSelected(true);
        this.changeLanguage();
    }
      
    public void unselectedButton(){
        vn.setSelected(false);
        en.setSelected(false);
    }
}
