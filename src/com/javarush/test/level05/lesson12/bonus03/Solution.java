package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите здесь ваш код
        int N;
        int i;
        int M;

        while (true)
        {
            N = Integer.parseInt(reader.readLine());
            if (N>0)
                break;
        }

        for (i=0; i<N; i++)
        {
            M = Integer.parseInt(reader.readLine());

            if (M>maximum)
                maximum=M;
            else if (i==0 && M<0)
                maximum=M;


        }


        /*    arr = new int[N];

        for (i=0; i<N; i++)
        {
            M = Integer.parseInt(reader.readLine());
            arr[i]=M;
        }

        Arrays.sort(arr);
        maximum=arr[N-1]; */

        System.out.println(maximum);
    }

}
