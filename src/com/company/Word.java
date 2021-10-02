package com.company;

public class Word {
    private static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    private static char[] consonants = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л',
            'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};

    //гласная ли буква
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    //согласная ли буква
    private static boolean isConsonants(char c) {
        c = Character.toLowerCase(c);
        for (char d : consonants) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public int[] countVowels(String[] data){
        final int SIZE = data.length;
        int[] count = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            char[] strToArray = data[i].toCharArray();
            for (int j = 0; j < strToArray.length; j++){
                if (isVowel(strToArray[j])){
                    count[i]++;
                }
            }
        }
        return count;
    }

    public int[] countConsonants(String[] data){
        final int SIZE = data.length;
        int[] count = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            char[] strToArray = data[i].toCharArray();
            for (int j = 0; j < strToArray.length; j++){
                if (isConsonants(strToArray[j])){
                    count[i]++;
                }
            }
        }
        return count;
    }
}
