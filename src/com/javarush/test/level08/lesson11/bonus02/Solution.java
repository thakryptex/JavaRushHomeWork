package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> map = new HashMap<String, String>();

        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            map.put(city.toUpperCase(), family);
        }

        //read home number
        String writeCity;
        while (true) {
            writeCity = reader.readLine();
            if (writeCity.isEmpty()) continue;
            else break;
        }

        if (map.containsKey(writeCity.toUpperCase()))
            for (Map.Entry<String,String> x : map.entrySet()) {
                if (x.getKey().equals(writeCity.toUpperCase()))
                    System.out.println(x.getValue());
            }

    }
}
