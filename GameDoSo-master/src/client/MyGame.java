/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.controller.GameController;
import client.controller.HomeController;
import client.view.GameScreen;
import client.view.HomeScreen;
import common.Game;
import common.Screen;
import common.View;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuananhdev
 */
public class MyGame extends Game{

    public static int WIDTH = 680;
    public static int HEIGHT = 460;
    private Screen screen; 
    public MyGame() throws HeadlessException, IOException {
        screen = new HomeScreen(this);
        HomeController homeController = new HomeController((View) screen);
        
    }

    public void start() {
        screen.showScreen();
        setScreen(screen);
        
    }
}
