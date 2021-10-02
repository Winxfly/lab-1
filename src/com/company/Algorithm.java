package com.company;

public class Algorithm {
    Text text = new Text();
    Word word = new Word();

    public Algorithm (String t){
        System.out.println("Результат анализа:");
        for (int i = 0; i < text.text(t).length; i++){
            System.out.print("Предложение: " + text.text(t)[i]);
            System.out.print(" (Гласных:" + word.countVowels(text.text(t))[i]);
            System.out.print(" Согласных:" + word.countConsonants(text.text(t))[i] + ") ");
            if(word.countVowels(text.text(t))[i] > word.countConsonants(text.text(t))[i]){
                System.out.println("Гласных больше");
            }
            else if(word.countVowels(text.text(t))[i] < word.countConsonants(text.text(t))[i]){
                System.out.println("Согласных больше");
            }
            else{
                System.out.println("Кол-во глас. и соглас. одинаково");
            }
        }
    }
}