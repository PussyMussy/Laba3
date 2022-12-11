package Lr3;

import java.util.Scanner;

public class job7 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль

            int countDown = 1;

            while (countDown > 0) {
                for (char i = 'а'; i <= 'т'; i++) {
                    int b = i % 2;
                    if (b == 0) {
                        System.out.println(i);
                    }
                }
                countDown --;
                System.out.println("-----------------------------------------------");
            }

        for(char i = 'т';i>='а';i--)
                {
                int b = i % 2;
                if (b == 0) {
                System.out.println(i);

        }}}}








