package com.javarush.test.level08.lesson11.home09;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {

        Date curDate = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        String dayOldFormat = dateFormat.format(curDate);
        int dayNewFormat = Integer.parseInt(dayOldFormat);
        return dayNewFormat % 2 != 0;

    }
}
