package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> tenCats = new HashMap<String, Cat>();
        tenCats.put("Котелок 1", new Cat("cat1"));
        tenCats.put("Котелок 2", new Cat("cat2"));
        tenCats.put("Котелок 3", new Cat("cat3"));
        tenCats.put("Котелок 4", new Cat("cat4"));
        tenCats.put("Котелок 5", new Cat("cat5"));
        tenCats.put("Котелок 6", new Cat("cat6"));
        tenCats.put("Котелок 7", new Cat("cat7"));
        tenCats.put("Котелок 8", new Cat("cat8"));
        tenCats.put("Котелок 9", new Cat("cat9"));
        tenCats.put("Котелок 10", new Cat("cat10"));

        return tenCats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> setCats = new HashSet<Cat>();
        for (Map.Entry<String,Cat> cat : map.entrySet())
            setCats.add(cat.getValue());

        return setCats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
