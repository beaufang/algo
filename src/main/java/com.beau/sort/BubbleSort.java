package com.beau.sort;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] a, int n) {
        boolean sorted = false; // 整体有序标志
        while (!sorted) {
            sorted = true; // 假定已经排序
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    // swap
                    int tmp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = tmp;
                    sorted = false; // 此次比较出现交换，有序性无法保证
                }
            }
            n--;
        }
    }



    public static void main(String[] args) {
        int[] a = {3, 4, 1, 9, 0, 12, 5, 9};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }


}
