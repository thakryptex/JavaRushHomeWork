package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String s;
        int n;
        int sum;
        int i=0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            s=reader.readLine();
            if (s.equals("сумма"))
                break;
            else
            {
                n = Integer.parseInt(s);
                sum = n + i;
                i = sum;
            }
        }

        System.out.println(i);

    }
}
