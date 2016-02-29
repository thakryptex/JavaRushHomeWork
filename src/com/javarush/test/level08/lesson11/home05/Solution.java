package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //Напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(s.length());
        CharacterIterator chit = new StringCharacterIterator(s);
        char ch=chit.current();
        char prev=' ';
        while (ch != CharacterIterator.DONE) {
            if (Character.isWhitespace(prev) && Character.isLetter(ch)) {
                stringBuilder.append(Character.toUpperCase(ch));
            } else {
                stringBuilder.append(ch);
            }
            prev=ch;
            ch=chit.next();
        }

        stringBuilder.toString();

        System.out.println(stringBuilder);

    }


}
