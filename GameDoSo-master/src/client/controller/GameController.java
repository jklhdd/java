/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.ItemUser;
import client.Status;
import client.User;
import client.view.GameScreen;
import common.Controller;
import common.SocketPort;
import common.View;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import common.SocketPort;

/**
 *
 * @author tuananhdev
 */
public class GameController extends Controller implements View.OnMouseClickListener{

    
    private JList list;
    private DefaultListModel<ItemUser> model;
    
    private String serverHost = "localhost";
    private int serverPort = SocketPort.GETALLPLAYERS;

    
    public GameController(View view) {
        super(view);
        this.view.setOnMouseClickListener(this);
        this.list  = ((GameScreen)this.view).getList();
        this.model = ((GameScreen)this.view).getModel();
        
        ArrayList<User> userList = new ArrayList<User>();
        userList = getAllUsers();
        for(User u: userList){
            model.addElement(new ItemUser(u.getName(), "src/server/assets/person.png", u.getStatus()));
        }
        
    }

    @Override
    public void onMouseClick(MouseEvent e) {
        int index = this.list.locationToIndex(e.getPoint());
        if(e.getX() >= 300 && e.getX() <= 380 && e.getY() >= 10 + index*50 && e.getY() <= 40 + index*50) {
            this.onButtonClick(index);
        }
    }
    
    private void onButtonClick(int position) {
    }
    
    public ArrayList<User> getAllUsers(){
        ArrayList<User> userList = new ArrayList<User>();
        try{            
            Socket mySocket = new Socket(serverHost, serverPort);
            ObjectOutputStream oos = new
            ObjectOutputStream(mySocket.getOutputStream());
            mySocket.getOutputStream().flush();
            ObjectInputStream ois = new
            ObjectInputStream(mySocket.getInputStream());
            Object o = ois.readObject();
            userList = (ArrayList<User>)o;            
        }catch(Exception e){
            e.printStackTrace();
        }
        return userList;
    }
}
