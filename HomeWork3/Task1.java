package HomeWork3;

import java.util.Arrays;

public class Task1 {

    public static int[] mergeSort(int[] array) {
        // Базовый случай - это когда один элемент
        int n = array.length;
        if (n <= 1)
            return array;

        // Разделим массив на две части с рекурсивной сортировкой обеих частей с помощью "mergesort"
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, n / 2));
        int[] right = mergeSort(Arrays.copyOfRange(array, n / 2, n));
        // Объединим массивы
        return merge(left, right);
    }
    // Объединяем два массива в отсортированный массив
    private static int[] merge(int[] left, int[] right) {

        int n1 = left.length;
        int n2 = right.length;
        int nResult = n1 + n2;
        int i1 = 0;
        int i2 = 0;
        int[] arrayResult = new int[nResult];
        // int count = 1;
        // рекурсивно  сливаем
        for (int i = 0; i < nResult; i++) {
            // System.out.println("Шаг  " + count++);
        // конечное условие 1
            if (i1 == n1) {                                                  
                arrayResult[i] = right[i2++];
                // конечное условие 2
            } else if (i2 == n2) {
                arrayResult[i] = left[i1++];
            } else {
                // формирование конечного массива
                if (left[i1] < right[i2]) {
                    arrayResult[i] = left[i1++];
                } else {
                    arrayResult[i] = right[i2++];
                }
            }
            // System.out.println(Arrays.toString(arrayResult));
            // System.out.println(java.util.Arrays.toString(left));
            // System.out.println(java.util.Arrays.toString(right));

        }

        return arrayResult;
    }

    // тест
    public static void main(String[] args) {
        int[] array = { 10, 4, 6, 4, 8, -13, 2, 3, 1 };
        System.out.println("Исходный массив: " + Arrays.toString(array));
        array = mergeSort(array);
        System.out.println("Результат сортировки: " + java.util.Arrays.toString(array));
        // // итог [-13, 1, 2, 3, 4, 4, 6, 8, 10]
        //   }
    }

}
