package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i=0;
        int sum;
        int n;
        String s;

        while (true)
        {
            s=reader.readLine();
            n=Integer.parseInt(s);

            if (n==-1)
            {
                sum = i + n;
                i = sum;
                break;
            }
            else
            {
                sum = i + n;
                i = sum;
            }

        }

        System.out.println(i);

    }
}
