package Lr3;

import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class job4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите первое число"); // Сообщение пользователю "для красоты и понимания"
        int first = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        System.out.println("Введите второе число"); // Сообщение пользователю "для красоты и понимания"
        int second = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
           if (first > second) {
               int[] nums = new int[first];
               int[] nums2 = new int[second];
               for (int i = 0 + second; i < first+1; i++) {
                   System.out.println("числа:" +i);
               }

           }
           else
           {
               int[] nums = new int[first];
               int[] nums2 = new int[second];
               for (int i = 0 + first; i < second+1; i++) {
                   System.out.println("числа:" +i);
               }
           }
        }}