package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> child = new ArrayList<Human>();
        child.add(new Human("Дитя", false, 15));
        child.add(new Human("Девочки", true, 4));
        child.add(new Human("Мелкий", false, 7));

        Human father = new Human("Батя", false, 40, child);
        Human mother = new Human("Мать", true, 37, child);

        ArrayList<Human> fList = new ArrayList<Human>(); fList.add(father);
        ArrayList<Human> mList = new ArrayList<Human>(); mList.add(mother);

        Human ded1 = new Human("Дед", false, 80, fList);
        Human bab1 = new Human("Бабка", true, 75, fList);

        Human ded2 = new Human("Дед", false, 80, mList);
        Human bab2 = new Human("Бабка", true, 75, mList);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);
        for (int i = 0; i < child.size(); i++)
        {
            System.out.println(child.get(i));
        }

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }

        public Human(String name, boolean sex, int age) {
            this.name=name;
            this.sex=sex;
            this.age=age;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
