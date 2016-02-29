package com.SinglyLinkedList;

/*
Создать List, где первый элемент - это Head, является входной точкой в список.
Конец списка обозначается null.
Каждый элемент списка содержит значение и указатель (pointer) на следующий элемент за ним элемент.
Pointer последнего элемента указывает на null
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
        от головы переходим к следующему элементу и проверяем pointer до тех пор,
        пока pointer не будет равен null,
        если равен, то меняем pointer на E, а к новому Node со значением E присваиваем pointer = null
        size++
         */

    }

    public void add(E elem, int index) {
        /*
        от головы переходим к следующему элементу каждый раз прибавляя к counter +1
        до тех пор пока не достигнем counter-1 = index
        в элементе перед index меняем ссылку на новый E, а в новом E pointer делаем index+1
        size++
         */

    }

    public int size() {
        return size;
    }

}
