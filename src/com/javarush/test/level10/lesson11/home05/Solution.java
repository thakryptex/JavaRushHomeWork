package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

/* ���������� ����
������ � ���������� 10 ������� � ���������� � ��� ���������� ��������� ���� (��� 33 ���� ��������).  ������� ��������� �� �����.
������ ������:
� 5
� 8
� 3
� 7
�
� 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //�������
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('�'+i));
        }
        alphabet.add(6,'�');

        //���� �����
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }

        //�������� ��� ��� ���
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i<alphabet.size(); i++) {
            count.add(0);
        }

        for (String x : list) {
            CharacterIterator charIt = new StringCharacterIterator(x);

            for (char c = charIt.first(); c != CharacterIterator.DONE; c=charIt.next()) {
                if (Character.isWhitespace(c) || Character.isDigit(c) || !alphabet.contains(c)) continue;
                int index = alphabet.indexOf(c);
                count.set(index, count.get(index)+1);
            }
        }

        for (int i = 0; i<alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count.get(i));
        }

    }

}
