/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controller;

import client.Status;
import client.User;
import common.SocketPort;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import server.views.ServerView;

/**
 *
 * @author Long
 */
public class ServerControl {
    private ServerView view;
    private Connection con;
    private ServerSocket myServer;
    private Socket clientSocket;
    
    private int getallusersPort = SocketPort.GETALLPLAYERS;
    
    public ServerControl(ServerView view){
        this.view = view;
        getDBConnection("gamedoso", "root", "");
        openServer(getallusersPort);        
        view.showMessage("TCP server is running...");
        while(true){
            listenning();
        }
    }
    
    private void getDBConnection(String dbName, String username,String password){
        String dbUrl = "jdbc:mysql://localhost/" + dbName;
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
            con = DriverManager.getConnection (dbUrl,
            username, password);
        }catch(Exception e) {
            view.showMessage(e.getStackTrace().toString());
        }
    }
    
    private void openServer(int portNumber){
        try {
            myServer = new ServerSocket(portNumber);
        }catch(IOException e) {
            view.showMessage(e.toString());
        }
    }
    
    private void listenning(){
        ArrayList<User> list = new ArrayList<User>();
        try {
            clientSocket = myServer.accept();
            ObjectInputStream ois = new
            ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream oos = new
            ObjectOutputStream(clientSocket.getOutputStream());
            oos.writeObject(getAllUsers());            
        }catch (Exception e) {
            view.showMessage(e.toString());
        }
    }
    
    private ArrayList<User> getAllUsers() throws Exception {
        String query = "Select * FROM user";
        ArrayList<User> userlist = new ArrayList<User>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"),rs.getString("name"),Status.intToStatus(rs.getInt("status")));
            userlist.add(user);
        }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return userlist;
    }
}
