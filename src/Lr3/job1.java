package Lr3;

import java.util.Scanner;

public class job1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число дня недели: ");
        int number = scanner.nextInt();
        if (number < 8 & number > 0) {
            switch (number) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
            }
        }
        else {
            System.out.println("Число не удовлетворяет условию (оно не входит в диапазон от 1 до 7 включительно)");
        }
        scanner.close();
    }

    }