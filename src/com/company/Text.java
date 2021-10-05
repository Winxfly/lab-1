package com.company;

public class Text {

    public String[] getSentences(String text) {
        char[] strToArray = text.toCharArray();
        int size = strToArray.length;

        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (strToArray[i] == '.' || strToArray[i] == '!' ||
                    strToArray[i] == '?') {
                counter++;
            }
        }
        String[] sentences = new String[counter];

        int index = 0;
        for (int i = 0; i < size; i++) {
            if (strToArray[i] == '.' || strToArray[i] == '!' ||
                    strToArray[i] == '?') {
                sentences[index] += String.valueOf(strToArray[i]);
                index++;
                i++;
            } else {
                if (sentences[index] == null) {
                    sentences[index] = String.valueOf(strToArray[i]);
                } else {
                    sentences[index] += String.valueOf(strToArray[i]);
                }
            }
        }
        return sentences;
    }
}