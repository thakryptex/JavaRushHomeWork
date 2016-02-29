package com.javarush.test.test;


public class Test {

        public static void main(String[] args) throws Exception {

            int N = 113;
            int thr = 4;
            System.out.println("Ostatok " + N % thr);

//            int begin
            for (int i = 0; i < 4; i++) {
                System.out.println((N/thr)*i);
                System.out.println((N/thr)*(i+1));
                System.out.println("Итерация " + i);
            }

        }
    }
