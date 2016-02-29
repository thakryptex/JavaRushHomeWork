package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.List;

/* ������� � ��������� �����
�������� ���������, ������� ������ � ���������� ������ ������.
��������� ������ ������� �� ����� ��� ������:
1. ������ ������ �������� ������ ������� �����
2. ������ - ������ ��������� ����� � ����� ���������� �� �������� ������.
����� ��������� ��������.

������ �����:
���� ���� ����.
������ ������:
� � � � � �
� � � � � � .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] sChars = s.toCharArray();
        StringBuilder vowStr = new StringBuilder();
        StringBuilder consStr = new StringBuilder();

        for (char x : sChars) {
            if (x==' ') continue;
            if (isVowel(x)) {
                vowStr.append(x);
                vowStr.append(" ");
            } else {
                consStr.append(x);
                consStr.append(" ");
            }
        }

        System.out.println(vowStr.toString());
        System.out.println(consStr.toString());
    }


    public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    //����� ���������, ������� �� �����
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //�������� ������ � ������ ������� - �� ��������� � �������� ������

        for (char d : vowels)   //���� ����� ������� �������
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
