package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(System.console().reader());

        System.out.println("Л/Р №1\nВариант задачи №10");
        System.out.println("Найти, каких букв, гласных или согласных," +
                "больше в каждом предложении текста.\n");

        boolean isFlag = true;
        while (true) {
            if (isFlag) {
                System.out.println("Поддерживаются только символы кириллицы!");
                System.out.print("Введите текст: ");
                String text = in.readLine();

                Algorithm algorithm = new Algorithm(text);
            }

            System.out.print("\nПовторить с новыми данными или " +
                    "выйти из программы? д/н: ");
            char flag = 0;

            try {
                flag = in.readLine().charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Неверный ввод!");
            }

            if (flag == 'д') {
                isFlag = true;
            } else if (flag == 'н') {
                break;
            } else {
                isFlag = false;
            }
        }
    }
}