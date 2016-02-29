package com.other.tasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CountingSortManyThreads implements Runnable {

    static int N, K, thr;
    static int[] A, B;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Thread> threads = new ArrayList<Thread>();


    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("����� N");
        N = scanner.nextInt();
        System.out.println("����� K");
        K = scanner.nextInt();

        System.out.println("������� ������� �� ������ ��������� ��� ������� ���� ������?");
        thr = scanner.nextInt();

        A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(K) + 1;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        countingSort(A);


    }

    private static void countingSort(int[] A) throws InterruptedException
    {
        long start = System.nanoTime();

        B = new int[K+1];

        for (int i = 0; i < thr - 1; i++) {
            threads.add(new Thread(new CountingSortManyThreads()));
            threads.get(i).start();
        }

        for (int i = 0; i < A.length/thr; i++) {      // A.length + 1
            plusOne(A[i]);                           // A.length
        }

        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).join();
        }

        for (int i = 0; i < B.length; i++) {      // B.length + 1
            if (B[i] > 0) {                       // B.length
                for (int j = 0; j < B[i]; j++) {  // B[i] + 1
                    System.out.print(i + " ");    // B[i]
                }
            }
        }
        long finish = System.nanoTime();


        System.out.println();
        System.out.println("�����: " + (finish - start));

        System.out.println("������: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
    }

    @Override
    public void run() {
        int index = threads.indexOf(Thread.currentThread()) + 1;
        int begin = (A.length/thr)*(index);
        int end;
        if (index == threads.size()) { // ���� thread �������� � ��������� ������ �������
            int left = N % thr; // �������� ������� �� ������� ������� ������� �� ���������� �������
            end = (A.length/thr)*(index+1) + left; // ���������� ������� � �������� ��������, ��� �� �������� ������� (��������� ������ ������� ����� �� �������� ������ �� ���������� �������)
        } else end = (A.length/thr)*(index+1);

        for (int i = begin; i < end; i++) {
            plusOne(A[i]);
        }
    }

    public synchronized static void plusOne(int index) {
        B[index]++;
    }

}
