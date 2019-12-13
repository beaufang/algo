package com.beau.sort;

import java.util.Arrays;

public class SelectSort {

    public void selectSort(int[] a, int n) {
        if (a == null || a.length == 1) return;
        // 不断的选择未排序区间最大的元素放入排序区间
        for (int i = n - 1; i > 0; i--) {
            int pMax = i;
            // 查找未排序区间的最大值
            for (int j = i - 1; j >= 0; j--) {
                if ( a[pMax] < a[j]) {
                    pMax = j;
                }
            }
            // 交换
            if (pMax != i) {
                int tmp = a[i];
                a[i] = a[pMax];
                a[pMax] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        test1();

    }

    public static void test1() {
        int[] a = {5, 7, 6, 6, 9, 6, 3, 11};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}

