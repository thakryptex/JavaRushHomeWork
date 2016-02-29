package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name, skinColor;
        int age, height;
        boolean sex;
        float weight;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name=name;
            this.sex=sex;
        }

        public Human(String name, boolean sex, String skinColor) {
            this.name=name;
            this.sex=sex;
            this.skinColor=skinColor;
        }

        public Human(String name, boolean sex, String skinColor, int age) {
            this.name=name;
            this.sex=sex;
            this.skinColor=skinColor;
            this.age=age;
        }

        public Human(String name, boolean sex, String skinColor, int age, int height) {
            this.name=name;
            this.sex=sex;
            this.skinColor=skinColor;
            this.age=age;
            this.height=height;
        }

        public Human(String name, boolean sex, String skinColor, int age, int height,  float weight)
        {
            this.name = name;
            this.skinColor = skinColor;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age) {
            this.name=name;
            this.age=age;
        }

        public Human(String name, String skinColor) {
            this.name=name;
            this.skinColor=skinColor;
        }

        public Human(boolean sex) {
            this.sex=sex;
        }

        public Human(boolean sex, String skinColor) {
            this.sex=sex;
            this.skinColor=skinColor;
        }
    }
}
