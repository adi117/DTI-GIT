package org.example;

public class TextProcessing {

    public static String removeChar(String givenText, String searchText){
        String[] arrayText = givenText.split(searchText);
        return String.join("", arrayText);
    }
}
