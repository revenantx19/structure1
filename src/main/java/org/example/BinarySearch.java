package org.example;

public class BinarySearch {

    public int binarySearch(Integer[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем средний элемент
            if (array[mid] == target)
                return mid; // Элемент найден, возвращаем его индекс

            // Если элемент больше среднего элемента, ищем в правой половине
            if (array[mid] < target)
                left = mid + 1;
            else
                // Если элемент меньше среднего элемента, ищем в левой половине
                right = mid - 1;
        }

        // Элемент не найден
        return -1;
    }
}
