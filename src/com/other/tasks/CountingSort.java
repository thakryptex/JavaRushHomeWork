package com.other.tasks;

import java.util.Random;
import java.util.Scanner;

public class CountingSort {

    static int N, K;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Введи N");
        N = scanner.nextInt();
        System.out.println("Введи K");
        K = scanner.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(K) + 1;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        countingSort(A);


    }

    private static void countingSort(int[] A) {
        long start = System.nanoTime();
        int[] B = new int[K+1];                   // 1

        for (int i = 0; i < A.length; i++) {      // A.length + 1
            B[A[i]]++;                            // A.length
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
        System.out.println("Время: " + (finish - start));

        System.out.println("Память: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
    }
}
