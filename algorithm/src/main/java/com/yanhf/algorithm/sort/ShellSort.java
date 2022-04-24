package com.yanhf.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序，插入排序变种
 */
public class ShellSort {
    //核心代码---开始
    public static void sort(Comparable[] arr) {

        int j;
        for (int gap = arr.length / 2; gap >  0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                Comparable tmp = arr[i];
                for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
    }

    //核心代码---结束
    public static void main(String[] args) {

        int N = 10;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        System.out.println("before sort");
        System.out.println(Arrays.toString(arr));
        ShellSort.sort(arr);
        System.out.println("after sort");
        System.out.println(Arrays.toString(arr));
    }
}
