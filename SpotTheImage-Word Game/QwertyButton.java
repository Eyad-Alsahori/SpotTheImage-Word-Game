package com.SpotTheImage;

import javax.swing.*;

public class QwertyButton extends JButton {
 
	private static final long serialVersionUID = 1L;
	private char value;

    public QwertyButton(char value) {
        this.value = value;

        this.setFocusable(false);
        this.setText(String.valueOf(this.value).toUpperCase());
    }

    public char getValue() {
        return this.value;
    }

}
