/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JFrame;

/**
 *
 * @author tuananhdev
 */
public abstract class Game extends JFrame{
    public Screen screen;
    
//    public void update() {
//        if(this.screen != null) {
//            this.screen.update();
//        }
//    }
    
    public void setScreen(Screen screen) {
        if(this.screen != null) {
            this.screen.hideScreen();
        }
        this.screen = screen;
        
        if(this.screen != null) {
            this.screen.showScreen();
        }
    }
}
