package com.javarush.test.level11.lesson11fake.home10;

//Расставь правильно "цепочку наследования" в классах: House, Cat, Dog, Car, Animal, Assets.

public class Solution
{
    public static void main(String[] args)
    {

    }

    public class Assets {}

    public class House extends Assets {}

    public class Car extends Assets {}

    public class Animal {}

    public class Cat extends Animal {}

    public class Dog extends Animal {}

}
