package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grandfa1 = new Human("Дед Боб", true, 66);
        Human grandfa2 = new Human("Дед Биггер", true, 65);
        Human grandmo1 = new Human("Бабка Матильда", false, 66);
        Human grandmo2 = new Human("Бабка Ванга", false, 65);
        Human father = new Human("Батько Махно", true, 40, grandfa1, grandmo1);
        Human mother = new Human("Матько Бахно", false, 35, grandfa2, grandmo2);
        Human child1 = new Human("Чадо, что первым было зачато", true, 13, father, mother);
        Human child2 = new Human("Чадо Женя - неизвестного пола с рожденья", false, 11, father, mother);
        Human child3 = new Human("Чадо ФедОр - возможно, пидОр", true, 7, father, mother);

        System.out.println(grandfa1);
        System.out.println(grandfa2);
        System.out.println(grandmo1);
        System.out.println(grandmo2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
