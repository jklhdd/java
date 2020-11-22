/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import client.ItemUser;
import client.MyGame;
import client.Status;
import client.UserRender;
import client.controller.GameController;
import common.Game;
import common.Screen;
import common.View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import utils.GameColor;

/**
 *
 * @author tuananhdev
 */
public class GameScreen extends View implements Screen{

    private JList<ItemUser> list;
    private DefaultListModel<ItemUser> model;
    private JButton btnInviteRandomly, btnEditProfile;
    private UserRender userRender;
    
    public GameScreen(Game game) throws HeadlessException, IOException {
        super(game);
        init();
        list.addMouseListener(this);
    }

    public JList<ItemUser> getList() {
        return list;
    }

    
    @Override
    public void init() {
        setLayout(new BorderLayout());
        model = new DefaultListModel<>();
        list = new JList(model);
        
        list.setBackground(new Color(0, 0, 0, 0));
        list.setFixedCellHeight(50);
        list.setEnabled(false);
        userRender = new UserRender();
        list.setCellRenderer(userRender);
        
        btnInviteRandomly = new JButton("Mời ngẫu nhiên");
        btnEditProfile = new JButton("Sửa thông tin");
        this.customButton(btnInviteRandomly);
        this.customButton(btnEditProfile);
        
        JScrollPane jScrollPane = new JScrollPane(list);
        jScrollPane.setBackground(Color.white);
        jScrollPane.getViewport().setScrollMode(JViewport.SIMPLE_SCROLL_MODE);
        
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.setBackground(new Color(0, 0, 0, 0));
        jPanel.setPreferredSize(new Dimension(260, MyGame.HEIGHT));

        
        jPanel.add(Box.createRigidArea(new Dimension(0, 100)));
        jPanel.add(btnInviteRandomly);
        jPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        jPanel.add(btnEditProfile);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.EAST);
    }
    
    private void customButton(JButton button) {
        button.setMaximumSize(new Dimension(140, 46));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
//        button.setBackground(Color.decode(GameColor.colorAccent3));
        button.setFocusable(false);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
    }
    
    public static void main(String[] args) throws HeadlessException, IOException {
        Game game = null;
        GameScreen gs = new GameScreen(game);
        gs.setVisible(true);
        new GameController(gs);
    }
    
    @Override
    public void showScreen() {
        this.setVisible(true);
    }

    @Override
    public void hideScreen() {
        this.setVisible(false);
    }
   
    public DefaultListModel<ItemUser> getModel() {
       return model;
    }
}
