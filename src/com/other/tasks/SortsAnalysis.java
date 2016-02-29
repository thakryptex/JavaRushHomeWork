package com.other.tasks;

import java.util.Scanner;

/*
Анализирую работу различных сортировок
Все от меньшего к большему
 */

public class SortsAnalysis {

    static int[] arrayStart;
    static int[] array;
//    static int[] small = {2, 1, 3, 4, 7, 2, 8, 9, 5, 10, 6};
    static int temp;
    static long startSort;
    static long finishSort;
    static int n;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
        n = 30000;
        arrayStart = new int[n];
        for (int i = 0; i < n; i++) {
            arrayStart[i] = (int) (Math.random() * 1000);
        }


        array = arrayStart.clone();
        startSort = System.nanoTime();
        FakeBubbleSort(array);
        finishSort = System.nanoTime();
        for(int n: array) {
            System.out.print(n + " ");}
        System.out.println();
        System.out.println("Время, затраченное на сортировку: " + (finishSort - startSort));
        System.out.println();


        array = arrayStart.clone();
        startSort = System.nanoTime();
        RealBubbleSort(array);
        finishSort = System.nanoTime();
        for(int n: array) {
            System.out.print(n + " ");}
        System.out.println();
        System.out.println("Время, затраченное на сортировку: " + (finishSort - startSort));
        System.out.println();


        array = arrayStart.clone();
        startSort = System.nanoTime();
        MyOldSort(array);
        finishSort = System.nanoTime();
        for(int n: array) {
            System.out.print(n + " ");}
        System.out.println();
        System.out.println("Время, затраченное на сортировку: " + (finishSort - startSort));
        System.out.println();

        array = arrayStart.clone();
        startSort = System.nanoTime();
        LikeMySort(array);
        finishSort = System.nanoTime();
        for(int n: array) {
            System.out.print(n + " ");}
        System.out.println();
        System.out.println("Время, затраченное на сортировку: " + (finishSort - startSort));
        System.out.println();


        array = arrayStart.clone();
        startSort = System.nanoTime();
        SelectionSort(array);
        finishSort = System.nanoTime();
        for(int n: array) {
            System.out.print(n + " ");}
        System.out.println();
        System.out.println("Время, затраченное на сортировку: " + (finishSort - startSort));
        System.out.println();


        array = arrayStart.clone();
        startSort = System.nanoTime();
        TwoSidedSelectionSort(array);
        finishSort = System.nanoTime();
        for(int n: array) {
            System.out.print(n + " ");}
        System.out.println();
        System.out.println("Время, затраченное на сортировку: " + (finishSort - startSort));
        System.out.println();



    }



    public static void MyOldSort(int[] array) {
        System.out.println("Мой старый способ сортировки");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void LikeMySort(int[] array) {
        System.out.println("Сортировка похожая на мою, иногда быстрее");
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i]<array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void FakeBubbleSort(int[] array) {
        System.out.println("Моя псевдо-пузырьковая сортировка");
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j]<array[j-1]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void RealBubbleSort(int[] array) {
        System.out.println("Пузырьковая сортировка");
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] array) {
        System.out.println("Сортировка выбором");
        int min, min_i, temp;
        for (int i = 0; i < array.length-1; i++) {
            min = array[i];
            min_i=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (min_i!=i) {
                temp = array[i];
                array[i] = min;
                array[min_i] = temp;
            }
        }
    }

    public static void TwoSidedSelectionSort(int[] array) {
        System.out.println("Двухсторонняя сортировка выбором");
        int min, min_i, max, max_i, temp;
        for (int i = 0; i < array.length-i; i++) {
            if (array[array.length-1-i]<array[i]) {
                temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = array[i];
                array[i] = temp;
            }
            min = array[i];
            min_i = i;
            max = array[array.length - 1 - i];
            max_i = array.length - 1 - i;
            for (int j = i+1; j < array.length-1-i; j++) {
                if (array[j]<min) {
                    min = array[j];
                    min_i = j;
                }
                if (array[j]>max) {
                    max = array[j];
                    max_i = j;
                }
            }
            if (min_i!=i) {
                temp = array[i];
                array[i] = min;
                array[min_i] = temp;
            }
            if (max_i!=array.length - 1 - i) {
                temp = array[array.length-1-i];
                array[array.length-1-i] = max;
                array[max_i] = temp;
            }
        }
    }

    public static void CombSort(int[] array) {
        System.out.println("Сортировка расчёской");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

            }
        }
    }

    public static void MergeSort(int[] array) {
        System.out.println("Сортировка слиянием");

    }

    public static void SleepSort(int[] array) throws Exception {
        System.out.println("Спящая сортировка");
        for (final int value : array) {
            new Thread()
            {
                @Override
                public void run() {
                    try {
                        Thread.sleep(value);
                        System.out.print(value + " ");
                    }
                    catch (InterruptedException e) {
                    }
                }
            }.start();
        }

    }


}
