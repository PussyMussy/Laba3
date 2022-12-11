package Lr3;

import java.util.Scanner;

public class job5 {


    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме: ");
        int size = id.nextInt();
        int[] nums = new int[size];
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++ ) {
            System.out.println("Введите числа: ");
            int a = id.nextInt();
            nums[i] = a;

            int x;
            int y;
            x = a % 5;
            y = a % 3;
            if (x == 2 | y == 1){
                System.out.println("Число удовлетворяет условиям деления на 5 или 3");
                sum = a + sum;
                System.out.println(a);
            }
            else {
                System.out.println("Число не удовлетворяет условиям деления на 5 или 3");
            }

    }
        System.out.println("Сумма удовлетворяющих чисел = "+sum);
    }}
