package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TextProcessing {

    public static String removeChar(String givenText, String searchText){
        String[] arrayText = givenText.split("");
        String[] arraySearchText = searchText.split("");

        int startIndex = 0;

        int searchTextLength = arraySearchText.length;

        ArrayList<String> concateText = new ArrayList<>();

        for (int i = 0; i < arrayText.length - searchTextLength; i++) {

            if(Objects.equals(String.join("", Arrays.copyOfRange(arrayText, i, i + searchTextLength)), searchText)){
                startIndex = i;
            }
        }

        concateText.add(String.join("", Arrays.copyOfRange(arrayText, 0, startIndex)));
        concateText.add(String.join("", Arrays.copyOfRange(arrayText, searchTextLength + startIndex, arrayText.length)));

        return String.join("", concateText);


//        return String.join("", arrayText);
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
