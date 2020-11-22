/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.controller.HomeController;
import client.view.HomeScreen;
import common.Game;
import common.View;
import java.awt.HeadlessException;
import java.io.IOException;

/**
 *
 * @author tuananhdev
 */
public class ClientRunner extends Game{
    
    public static void main(String[] args) throws HeadlessException, IOException {
                
        //HomeController homeController = new HomeController(homeScreen);
        MyGame game = new MyGame();
        game.start();
    }
}
