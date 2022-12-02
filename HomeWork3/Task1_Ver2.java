package HomeWork3;

import java.util.Arrays;

public class Task1_Ver2 {
    public static void main(String[] args) {
        int[] array1 = {10, 4, 6, 4, 8, -13, 2, 3, 1};
        int[] result = mergeSort(array1);
        System.out.printf("Исходный массив: %s\n", Arrays.toString(array1));
        System.out.printf("Результат сортировки: %s", Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    /**
     *
     * @param buffer1 Массив для сортировки.
     * @param buffer2 Буфер. Размер должен быть равен размеру buffer1.
     * @param startIndex Начальный индекс в buffer1 для сортировки.
     * @param endIndex Конечный индекс в buffer1 для сортировки.
     * @return
     */
    public static int[] mergeSortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
            // System.out.println("Общий");
            // System.out.println(Arrays.toString(result));
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
            // System.out.println("Левый");
            // System.out.println(Arrays.toString(result));
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
            // System.out.println("Правый");
            // System.out.println(Arrays.toString(result));
        
        }
        return result;
    }
}
