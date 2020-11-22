/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import common.Game;
import common.Screen;
import common.View;
import java.awt.HeadlessException;
import java.io.IOException;

/**
 *
 * @author tuananhdev
 */
public class PlayScreen extends View implements Screen{

    public PlayScreen(Game game) throws HeadlessException, IOException {
        super(game);
        init();
        
    }

    @Override
    public void init() {
        
    }

    @Override
    public void showScreen() {
        this.setVisible(true);
    }

    @Override
    public void hideScreen() {
        this.setVisible(false);
    }
    
}
