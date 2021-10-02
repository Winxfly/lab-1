package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Л/Р №1\nВариант задачи №10");
		System.out.println("Найти, каких букв, гласных или согласных, больше в каждом предложении текста.\n");

		boolean isFlag = true;
		while (true){
			Scanner console = new Scanner(System.in);
			if(isFlag){
				System.out.print("Введите текст:");
				String data = console.nextLine();

				Algorithm algorithm = new Algorithm(data);
			}

			System.out.print("\nПовторить с новыми данными или выйти из программы? д/н: ");
			char flag = console.next().charAt(0);
			if (flag == 'д'){
				isFlag = true;
			}
			else if (flag == 'н'){
				break;
			}
			else{
				isFlag = false;
			}
		}
    }
}
