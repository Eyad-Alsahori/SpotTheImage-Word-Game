package com.SpotTheImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JPanel implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PlayButton playButton;
    private ExitButton exitButton;

    public StartScreen(int WIDTH, int HEIGHT, ImageIcon backgroundImg, JPanel container, CardLayout cardLayout) {

        JLabel startScreenBg = new JLabel(backgroundImg);

        
        //below here we creat the dimentions of our buttons
        //button dimensions
        int buttonWidth = 100;
        int buttonHeight = 50;
        int buttonY = HEIGHT - (buttonHeight * 3);

        //PLAY button
        String playButtonText = "PLAY";
        int playButtonX = (WIDTH / 2) - (buttonWidth + 20);
        this.playButton = new PlayButton(playButtonText, playButtonX, buttonY, buttonWidth, buttonHeight, container, cardLayout);
        this.playButton.addActionListener(this);

        //EXIT button
        String exitButtonText = "EXIT";
        int exitButtonX = (WIDTH / 2) + 20;
        this.exitButton = new ExitButton(exitButtonText, exitButtonX, buttonY, buttonWidth, buttonHeight);
        this.exitButton.addActionListener(this);

        this.setLayout(new BorderLayout());
        this.add(startScreenBg);

        startScreenBg.setLayout(null);
        startScreenBg.add(this.playButton);
        startScreenBg.add(this.exitButton);
    }

    @Override
    // we have the ability to more home screens, incase we decide to add the feature to give player the option to select from multiple games 
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.playButton) {
            this.playButton.swapCard("2");
        }

        if (e.getSource() == this.exitButton) {
            System.exit(0);
        }
    }
}



//tool