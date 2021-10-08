package com.company;

// Найти факториал N-го числа

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class Example {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Решение

        System.out.print("N = ");
        int n = in.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;

        }
        System.out.println(n + "! = " + fact);

        return;
    }
}
