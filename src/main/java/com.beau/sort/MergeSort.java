package com.beau.sort;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] a, int low, int high) {
        if (a == null || high - low < 2) return;
        int mid = ((high - low) >>> 1) + low;
        mergeSort(a, low, mid);
        mergeSort(a, mid, high);
        merge(a, low, mid, high);
    }

    private void merge(int[] a, int low, int mid, int high) {
        int[] b = new int[high - low];
        int p1 = low;
        int p2 = mid;
        int cur = 0;
        while (p1 < mid || p2 < high) {
            // 注意 || 语句前后顺序
            if (p1 < mid && (p2 >= high || a[p1] < a[p2])) {
                b[cur] = a[p1++];
            } else {
                b[cur] = a[p2++];
            }
            cur++;
        }
        // copy to original
        System.arraycopy(b, 0, a, low, b.length);
    }

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[] a = {5, 7, 6, 6, 9, 6, 3, 11, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }
}
