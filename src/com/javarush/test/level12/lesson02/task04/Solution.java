package com.javarush.test.level12.lesson02.task04;

//Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей:
//«Кошка», «Собака», «Птица», «Лампа».

 public class Solution
{
    public static void main( String[] args )
    {
        printObjectType( new Cat() );
        printObjectType( new Bird() );
        printObjectType( new Lamp() );
        printObjectType( new Cat() );
        printObjectType( new Dog() );
    }

    public static void printObjectType(Object o) {

        String objectType = null;

        if (o instanceof Cat)
            objectType="Кошка";

        if (o instanceof Dog)
            objectType="Собака";

        if (o instanceof Bird)
            objectType="Птица";

        if (o instanceof Lamp)
            objectType="Лампа";
    }

    public static class Cat {}

    public static class Bird {}

    public static class Lamp {}

    public static class Dog {}

}