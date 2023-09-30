package com.SpotTheImage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class Words {

private List<String> wordList; // Add a list to store the different words

private Word emergencyWord;

public Words() {
	
//list of words
this.wordList = Arrays.asList("cap", "cat", "bug","soccer ball", "baseball", "snake","branch", "cake", "card","fast food", "paint", "pencil","snack", "basketball", "puzzle","car", "purse", "books"); // Initialize the list with the desired words

new Random();

this.emergencyWord = new Word("Rat");

}


/*
Selects a random word from the list of words
*/
public Word selectRandomWord() {

	   if (this.wordList.size() > 0) {
	      // Shuffle the list of words
	      Collections.shuffle(this.wordList);
	      // Return the first word in the shuffled list
	      return new Word(this.wordList.get(0));
	   }
	   return this.emergencyWord;
	}
}