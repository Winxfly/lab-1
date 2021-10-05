package com.company;

public class Word {

    //гласная ли буква
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        String vowels = "аяуюиыэеоё";
        int size = vowels.length();
        for (int i = 0; i < size; i++) {
            if (c == vowels.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //согласная ли буква
    private boolean isConsonants(char c) {
        c = Character.toLowerCase(c);
        String consonants = "бвгджзйклмнпрстфхцчшщ";
        int size = consonants.length();
        for (int i = 0; i < size; i++) {
            if (c == consonants.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public int[] countVowels(String[] text) {
        final int sizeOfText = text.length;
        int[] count = new int[sizeOfText];

        for (int i = 0; i < sizeOfText; i++) {
            char[] strToArray = text[i].toCharArray();
            for (int j = 0; j < strToArray.length; j++) {
                if (isVowel(strToArray[j])) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    public int[] countConsonants(String[] text) {
        final int sizeOfText = text.length;
        int[] count = new int[sizeOfText];

        for (int i = 0; i < sizeOfText; i++) {
            char[] strToArray = text[i].toCharArray();
            for (int j = 0; j < strToArray.length; j++) {
                if (isConsonants(strToArray[j])) {
                    count[i]++;
                }
            }
        }
        return count;
    }
}