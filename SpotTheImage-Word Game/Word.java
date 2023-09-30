package com.SpotTheImage;

/*
over we Split the words into letters to compare between the letter clicked on the keyboard
 */
public class Word {

private String word;
private char[] lettersInWord;

public Word(String word) {
this.word = word;
}

public void splitWordToLetters() {

this.lettersInWord = this.word.toCharArray();
}

public char[] getLettersInWord() {
return this.lettersInWord;
}

public String getWord() {
return this.word;
}
}