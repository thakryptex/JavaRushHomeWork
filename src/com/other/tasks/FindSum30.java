package com.other.tasks;

/*
���� ���� ������:

" " + " " + " " = 30
����� ��������� ������ �����, ��������� {1, 3, 5, 7, 9, 11, 13, 15}
���� � �� �� ����� ����� �������������� ��������� ���.

����� ����� �� ��������� ���������, �� ����� ��������� ������������.
������ � �������.
 */

public class FindSum30 {

    static int[] array = {1, 3, 5, 7, 9, 11, 13, 15};

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if(array[i]+array[j]+array[k]==30)
                        System.out.println(array[i] + " " + array[j] + " " + array[k] + " = " + "30");
                }
            }
        }
    }
}
