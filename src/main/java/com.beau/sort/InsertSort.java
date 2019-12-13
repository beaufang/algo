package com.beau.sort;

import java.util.Arrays;

public class InsertSort {

    public void insertSort(int[] a, int n) {
        if (a == null || a.length == 1) return;
        // 从未排序区间挑选元素插入已排序区间
        for (int i = 1; i < n; i++) {
            // 查找插入位置，可优化
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j]; // 搬移元素
                } else {
                    break;
                }
            }
            a[j + 1] = value; // 插入元素
        }
    }

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[] a = {5, 7, 6, 6, 9, 6, 3, 11};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
