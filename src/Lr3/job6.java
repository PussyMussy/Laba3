package Lr3;

import java.util.Scanner;


public class job6 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        if (size<=0){
            System.out.println("Введите положительное число и не 0");
        }
        else {
        int[] nums = new int[size]; // Создание массива с размером введённым из консоли
        int x=0;
        nums [x] = 2;
        for (int i = 0 ; i < nums.length ; i++ )
        {
            if (nums [x] == 2)
            {
                System.out.println("Число № ["+i+"] = " + nums[x]);
                nums [x] = nums [x] + 5;
                System.out.println("Число № ["+i+"] = " + nums[x]);
            }
            else {
                nums[x] = nums[x] + 5;
                System.out.println("Число № [" + i + "] = " + nums[x]);
            }

        }
    }}
}



      /*           if (x==1)
                         {
                         nums[i] = nums[i + 5] ; // Присвоение i-тому элементу массива случайного значения
                         System.out.println("Число № [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"

                         }


                else
                        {

                        nums[i] = nums[i + 10] ; // Присвоение i-тому элементу массива случайного значения
                        System.out.println("Число № [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
                        }*/