package com.SpotTheImage;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        final int WIDTH = 1200;
        final int HEIGHT = 800;
        final String TITLE = "SpotTheImage (Word Game)";
        // the file which contains our home screen image
        final ImageIcon backgroundImg = new ImageIcon("C:/Users/Eyad/eclipse-workspace/CSC-330/src/com/SpotTheImage/HS2.png");



        JFrame screen = new JFrame();
        CardLayout cardLayout = new CardLayout();
        screen.setSize(new Dimension(WIDTH, HEIGHT));
        screen.setTitle(TITLE);
        screen.setLocationRelativeTo(null);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel container = new JPanel();
        container.setLayout(cardLayout);
        screen.add(container);

        Words words = new Words();

       
        MainGamePanel mainGamePanel = new MainGamePanel(WIDTH, HEIGHT, container, cardLayout, words);
        Homescreen homescreen = new Homescreen(WIDTH, HEIGHT, backgroundImg, container, cardLayout, mainGamePanel, words);

   // we have the option to select which screen gets appeared first, when the game starts
        container.add(homescreen, "2");
        container.add(mainGamePanel, "3");

        screen.setVisible(true);
    }
}