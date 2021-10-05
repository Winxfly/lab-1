package com.company;

public class Algorithm {
    Text text = new Text();
    Word word = new Word();

    public Algorithm(String data) {
        System.out.println("\nРезультат анализа:");

        int size = text.getSentences(data).length;
        for (int i = 0; i < size; i++) {
            int vowels = word.countVowels(text.getSentences(data))[i];
            int consonants = word.countConsonants(text.getSentences(data))[i];

            System.out.print("Предложение: " + text.getSentences(data)[i]);
            System.out.print(" (Гласных:" + vowels);
            System.out.print(" Согласных:" + consonants + ") ");
            if (vowels > consonants) {
                System.out.println("Гласных больше");
            } else if (vowels < consonants) {
                System.out.println("Согласных больше");
            } else {
                System.out.println("Кол-во глас. и соглас. одинаково");
            }
        }
    }
}