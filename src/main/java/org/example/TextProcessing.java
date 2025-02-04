package org.example;

import java.util.Objects;

public class TextProcessing {

    public static String removeChar(String givenText, String searchText){
        String[] arrayText = givenText.split(searchText);
        return String.join("", arrayText);
    }

    public static Boolean checkPalindrome(String text){
        String[] characterText = text.split("");

        boolean isPalindrome = false;
        
        for (int i = 0; i < (characterText.length / 2); i++) {
            if (!Objects.equals(characterText[i], characterText[characterText.length - 1 - i])){
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        
        return isPalindrome;
    }
}
