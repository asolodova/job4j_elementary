package ru.job4j;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0, j = data.length -1; i <= j; i++, j--) {
            int min = MinDiapason.findMin(data, i, j);
            int index = FindLoop.indexOf(data, min, i, j);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
