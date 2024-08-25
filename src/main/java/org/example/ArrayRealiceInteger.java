package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class ArrayRealiceInteger implements IntegerList {

    private Integer[] array;
    private int size;

    public ArrayRealiceInteger(int initSize) throws IllegalAccessException {
        if (initSize <= 0) {
            throw new IllegalAccessException("Размер массива должен быть положительным числом");
        }
        this.array = new Integer[initSize];
        this.size = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public Integer add(Integer item) throws IllegalAccessException {
        if (item == null) {
            throw new IllegalAccessException("Элемент не может быть null.");
        }
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[size] = item;
        size++;
        return item;
    }

    public Integer add(int index, Integer item) throws IllegalAccessException {
        if (item == null) {
            throw new IllegalAccessException("Элемент не может быть null");
        }
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        array = Arrays.copyOf(array, array.length + 1);
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        return item;
    }

    public Integer set(int index, Integer item) throws IllegalAccessException {
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        array[index] = item;
        return item;
    }

    public Integer remove(Integer item) throws IllegalAccessException {
        if (item == null) {
            throw new IllegalAccessException("Элемент не может быть null");
        }
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], item)) {
                array[i] = null;
                return item;
            }
        }
        throw new IllegalAccessException("Элемента нет в массиве");
    }

    public Integer remove(int index) throws IllegalAccessException {
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        Integer save = array[index];
        array[index] = null;
        return save;
    }

    public boolean contains(Integer item) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(item, array[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Integer item) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Integer item) {

        for (int i = array.length - 1; i > 0; i--) {
            if (Objects.equals(array[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public Integer get(int index) throws IllegalAccessException {
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        return array[index];
    }

    public boolean equals(IntegerList otherList) {
        if (Objects.equals(array, otherList)) {
            return true;
        }
        return false;
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        array = Arrays.copyOf(array, 0);
    }

    public Integer[] toArray() {
        return new Integer[]{Integer.valueOf(Arrays.toString(array))};
    }
    public Integer[] get() {
        return array;
    }

}
