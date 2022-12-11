package Lr3;

import java.util.Scanner;

public class job2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = scanner.nextLine();
        switch (day) {
            case "Понедельник":
                System.out.println("1-ый день");
                break;
            case "Вторник":
                System.out.println("2-ой день");
                break;
            case "Среда":
                System.out.println("3-ий день");
                break;
            case "Четверг":
                System.out.println("4-ый день");
                break;
            case "Пятница":
                System.out.println("5-ый день");
                break;
            case "Суббота":
                System.out.println("6-ой день");
                break;
            case "Воскресенье":
                System.out.println("7-ой день");
                break;
            default:
                System.out.println("Название дня введено неправильно");
        }
        scanner.close();
    }
}

