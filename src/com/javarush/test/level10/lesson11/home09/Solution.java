package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) не влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {

        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            int c = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)))
                    c+=1;
            }

            result.put(list.get(i), c);
        }

        return result;

        //        HashMap<String, Integer> result = new HashMap<String, Integer>();
//
//        for (int i = 0; i < list.size(); i++) {
//
//            if (result.containsKey(list.get(i).toLowerCase())) continue;
//            int c = 1;
//            for (int j = i+1; j < list.size(); j++) {
//                if(list.get(i).toLowerCase().equals(list.get(j).toLowerCase())) {
//                    result.put(list.get(i).toLowerCase(), c+=1);
//                }
//            }
//        }
//
//        return result;

    }

}
