package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum=0;
        int  minimum=0;

        //Напишите тут ваш код
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(reader.readLine());
        }


        for (int i=0; i < arr.length; i++) {
            if (arr[0]>0) minimum=arr[0];
            else if (arr[i]<minimum) minimum=arr[i];
        }

        Arrays.sort(arr);
        maximum=arr[arr.length-1];


        System.out.println(maximum + " " + minimum);
    }
}
