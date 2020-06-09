package com.company;

import java.util.Scanner;

public class IntArray {
    int[] array;
    private Scanner scanner = new Scanner(System.in);

    IntArray(int size){
        array = new int[size];
        addValue(0);
        printValue(0);
    }

    public void addValue(int n){
        array[n] = scanner.nextInt();
        if (n < array.length - 1)
            addValue(n+1);
    }

    public void printValue(int n){
        System.out.print(array[n] + " ");
        if (n < array.length - 1)
            printValue(n+1);
    }
}
