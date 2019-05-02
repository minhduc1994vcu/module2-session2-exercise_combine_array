package com.codegym;

public class CombineArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int size3 = array1.length + array2.length;
        int[] array3 = new int[size3];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            array3[array1.length + i] = array2[i];
        }
        for (int temp : array3) {
            System.out.print(temp + "\t");
        }
    }
}
