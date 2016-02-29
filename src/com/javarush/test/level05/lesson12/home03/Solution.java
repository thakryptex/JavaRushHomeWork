package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse nibblesMouse = new Mouse("Nibbles", 10, 4);

        Cat tomCat = new Cat("Tom", "Grey", 40);
        Cat butchCat = new Cat("Butch", "Black", 40);

        Dog spikeDog = new Dog("Spike", "Grey", 50);
        Dog puppyDog = new Dog("Puppy", "Grey", 15);

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //Напишите тут ваши классы
    public static class Cat
    {
        String name;
        int height;
        String color;

        public Cat(String name, String color, int height)
        {
            this.name=name;
            this.color=color;
            this.height=height;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        String color;

        public Dog(String name, String color, int height)
        {
            this.name=name;
            this.color=color;
            this.height=height;
        }
    }

}
