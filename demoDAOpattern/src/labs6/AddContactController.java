/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs6;

import demodaopattern.DataAccessObjectContact;
import javafx.scene.control.TextField;

/**
 *
 * @author Long
 */
public class AddContactController {
    public TextField addName = new TextField();
    public TextField addCom = new TextField();
    public TextField addAddress = new TextField();

    public void submit(){
        Contact c = new Contact(null,addName.getText(),
                addCom.getText(),addAddress.getText());

        DataAccessObjectContact dao = new DataAccessObjectContact();
        if(dao.create(c)>0){
            Labs6.mainStage.getScene().setRoot(Labs6.root);
            ContactController.render();
        }
    }
}
