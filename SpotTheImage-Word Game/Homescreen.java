package com.SpotTheImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homescreen extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	final String[] categoryButtonsText = {"Play"};
    private CategoryButton[] categoryButtons = new CategoryButton[3];
    private BackButton backButton;
    private MainGamePanel mainGamePanel;
    private Words words;

    public Homescreen(int WIDTH, int HEIGHT, ImageIcon backgroundImg, JPanel container, CardLayout cardLayout, MainGamePanel mainGamePanel, Words words) {
        this.mainGamePanel = mainGamePanel;
        this.words = words;

        JLabel categoryScreenBg = new JLabel(backgroundImg);

        this.setLayout(new BorderLayout());
        this.add(categoryScreenBg);

        categoryScreenBg.setLayout(null);

        JPanel buttonsPanel = new JPanel();
        int buttonsPanelWidth = 500;
        int buttonsPanelHeight = 50;
        int buttonsPanelX = (WIDTH / 2) - (buttonsPanelWidth / 2);
        int buttonsPanelY = HEIGHT - (buttonsPanelHeight * 3);
        buttonsPanel.setBounds(buttonsPanelX, buttonsPanelY, buttonsPanelWidth, buttonsPanelHeight);
        buttonsPanel.setLayout(new GridLayout());

        categoryScreenBg.add(buttonsPanel);

        for (int i=0; i<this.categoryButtonsText.length; i++) {
            CategoryButton categoryButton = new CategoryButton(this.categoryButtonsText[i], container, cardLayout);
            categoryButton.setCategory(this.categoryButtonsText[i].toLowerCase());
            this.categoryButtons[i] = categoryButton;
            categoryButton.addActionListener(this);
            buttonsPanel.add(categoryButton);
        }

        String backButtonText = "Exit";
        this.backButton = new BackButton(backButtonText, container, cardLayout);
        this.backButton.addActionListener(this);
        buttonsPanel.add(this.backButton);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {


         if (e.getSource() == this.backButton) {
        	 System.exit(0);
         }
    }
}

