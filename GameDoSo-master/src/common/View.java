/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import client.MyGame;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import utils.ImagePanel;

/**
 *
 * @author tuananhdev
 */
public abstract class View extends JFrame implements ActionListener, MouseListener{

    private int xMouse;
    private int yMouse;
    public Game game;
    
    public interface OnClickListener {
        void onClick(ActionEvent e);
    }
    
    public interface OnMouseClickListener {
        void onMouseClick(MouseEvent e);
    }
    
    protected OnClickListener onClickListener;
    protected OnMouseClickListener onMouseClickListener;
    
    public View(Game game) throws HeadlessException, IOException {
        super();
        this.game = game;
        
        setSize(MyGame.WIDTH, MyGame.HEIGHT);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }
        });
        this.setLocationRelativeTo(null);
        
        BufferedImage myImage = ImageIO.read(new File("src/client/assets/background.jpg"));
        this.setContentPane(new ImagePanel(myImage));
        this.setLayout(new FlowLayout());
    }

    public void setOnMouseClickListener(OnMouseClickListener onMouseClickListener) {
        this.onMouseClickListener = onMouseClickListener;
    }
    
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        onMouseClickListener.onMouseClick(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        onClickListener.onClick(e);
    }
    
    public abstract void init();
}
