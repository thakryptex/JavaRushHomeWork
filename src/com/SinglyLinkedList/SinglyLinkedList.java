package com.SinglyLinkedList;

/*
������� List, ��� ������ ������� - ��� Head, �������� ������� ������ � ������.
����� ������ ������������ null.
������ ������� ������ �������� �������� � ��������� (pointer) �� ��������� ������� �� ��� �������.
Pointer ���������� �������� ��������� �� null
 */

import java.util.LinkedList;


public class SinglyLinkedList<E> {

    private class Head {}

    private static class Node<E> {
        E elem;
        Node<E> next;

        Node(E elem, Node<E> next) {
            this.elem=elem;
            this.next=next;
        }
    }

    private int size;

    public SinglyLinkedList(){}

    public void delete(int index) {

    }

    public void add(E elem) {
        /*
        �� ������ ��������� � ���������� �������� � ��������� pointer �� ��� ���,
        ���� pointer �� ����� ����� null,
        ���� �����, �� ������ pointer �� E, � � ������ Node �� ��������� E ����������� pointer = null
        size++
         */

    }

    public void add(E elem, int index) {
        /*
        �� ������ ��������� � ���������� �������� ������ ��� ��������� � counter +1
        �� ��� ��� ���� �� ��������� counter-1 = index
        � �������� ����� index ������ ������ �� ����� E, � � ����� E pointer ������ index+1
        size++
         */

    }

    public int size() {
        return size;
    }

}
