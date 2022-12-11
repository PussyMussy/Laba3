package Lr3;

import java.util.Arrays; // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class job3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите количество чисел Фибоначчи"); // Сообщение пользователю "для красоты и понимания"
        int size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        //значения введенного в консоль
        int[] nums = new int[size]; // Создание массива с размером введённым из консоли
        for (int i = 0 ; i < nums.length ; i++ ){
            if (i < 3){
                nums [0] = 1;
                nums [1] = 1;
                nums [2] = 2;
                System.out.println("Число № ["+i+"] = " + nums[i]);
            }
            else {
                nums[i] = nums[i - 2] + nums[i - 1]; // Присвоение i-тому элементу массива случайного значения
                System.out.println("Число № [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
            }
            }
    }
}