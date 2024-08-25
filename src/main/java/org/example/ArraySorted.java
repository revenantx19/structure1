package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArraySorted {

    ArrayRealiceInteger arrayRealiceInteger = new ArrayRealiceInteger(100000);
    QuickSort quickSort = new QuickSort();
    BinarySearch binarySearch = new BinarySearch();
    Integer[] arrInt = arrayRealiceInteger.get();

    public ArraySorted() throws IllegalAccessException {
    }

    public void sortedArray() {
        Integer[] arrInt = arrayRealiceInteger.get();
        Arrays.sort(arrInt);
    }

    public void quickSort() {
        quickSort.quickSort(arrInt, 0, arrInt.length - 1);
    }

    public void setBinarySearch() {
        quickSort();
        System.out.println("Бинпоиск элемент 10: " + binarySearch.binarySearch(arrInt, 10));
    }


    public void checkerTimeSort() {
        //таймер на быструю сортировку
        long start = System.currentTimeMillis();
        quickSort();
        System.out.println(System.currentTimeMillis() - start);
        //таймер на стандартный поиск
        long start1 = System.currentTimeMillis();
        sortedArray();
        System.out.println(System.currentTimeMillis() - start1);


    }

}
