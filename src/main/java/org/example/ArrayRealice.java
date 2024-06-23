package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ArrayRealice implements StringList {

    private String[] array;
    private int size;

    public ArrayRealice(int initSize) throws IllegalAccessException {
        if (initSize <= 0) {
            throw new IllegalAccessException("Размер массива должен быть положительным числом");
        }
        this.array = new String[initSize];
        this.size = 0;
    }

    public String add(String item) throws IllegalAccessException {
        if (item == null) {
            throw new IllegalAccessException("Элемен не может быть null.");
        }
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[size] = item;
        size++;
        return item;
    }

    public String add(int index, String item) throws IllegalAccessException {
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

    public String set(int index, String item) throws IllegalAccessException {
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        array[index] = item;
        return item;
    }

    public String remove(String item) throws IllegalAccessException {
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

    public String remove(int index) throws IllegalAccessException {
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        String save = array[index];
        array[index] = null;
        return save;
    }

    public boolean contains(String item) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(item, array[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String item) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String item) {

        for (int i = array.length - 1; i > 0; i--) {
            if (Objects.equals(array[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public String get(int index) throws IllegalAccessException {
        if (index >= array.length || index < 0) {
            throw new IllegalAccessException("Недопустимый индекс");
        }
        return array[index];
    }

    public boolean equals(StringList otherList) {
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

    public String[] toArray() {
        return new String[]{Arrays.toString(array)};
    }
}
