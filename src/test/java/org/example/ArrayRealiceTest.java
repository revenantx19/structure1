package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRealiceTest {

    ArrayRealice testArray = new ArrayRealice(4);

    ArrayRealiceTest() throws IllegalAccessException {
    }

    @org.junit.jupiter.api.Test
    void add() throws IllegalAccessException {
        String result = testArray.add("Собака");
        assertEquals("Собака", result);
    }

    @org.junit.jupiter.api.Test
    void addWithIndex() throws IllegalAccessException {
        String result = testArray.add(3, "Орёл");
        assertEquals("Орёл", result);
    }

    @org.junit.jupiter.api.Test
    void set() throws IllegalAccessException {
        String result = testArray.set(3, "Карп");
        assertEquals("Карп", result);
    }

    @org.junit.jupiter.api.Test
    void remove() throws IllegalAccessException {
        testArray.add("Собака");
        String res = testArray.remove("Собака");
        assertEquals("Собака", res);
    }

    @org.junit.jupiter.api.Test
    void removeByIndex() throws IllegalAccessException {
        testArray.add(3, "Кошка");
        String res = testArray.remove(3);
        assertEquals("Кошка", res);
    }

    @org.junit.jupiter.api.Test
    void contains() throws IllegalAccessException {
        testArray.add("Хомяк");
        boolean res = testArray.contains("Хомяк");
        assertEquals(true, res);
    }

    @org.junit.jupiter.api.Test
    void indexOf() throws IllegalAccessException {
        testArray.add(2, "Лось");
        int res = testArray.indexOf("Лось");
        assertEquals(2, res);
    }

    @org.junit.jupiter.api.Test
    void lastIndexOf() throws IllegalAccessException {
        testArray.add("Корыто");
        testArray.add("Сапог");
        testArray.add("Мясорубка");
        testArray.add("Валенки");
        int res = testArray.lastIndexOf("Мясорубка");
        assertEquals(2, res);
    }

    @org.junit.jupiter.api.Test
    void get() throws IllegalAccessException {
        testArray.add("Валенки");
        String res = testArray.get(0);
        assertEquals("Валенки", res);
    }

    @org.junit.jupiter.api.Test
    void testEquals() throws IllegalAccessException {
        testArray.add("Кошка");
        testArray.add("Котёнок");
        testArray.add("Щенок");
        String[] testArray2 = {"Кошка", "Котёнок", "Щенок"};
        boolean res = testArray.equals(testArray2);
        assertEquals(testArray2, res);
    }

    @org.junit.jupiter.api.Test
    void size() throws IllegalAccessException {
        int res = testArray.size();
        assertEquals(4, res);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        //testArray.clear();
        boolean res = testArray.isEmpty();
        assertEquals(true, res);
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void toArray() {
    }

}