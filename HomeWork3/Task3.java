// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
//  арифметичское этого списка.
package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> userArr = new ArrayList<>();
        userArr.add(3);
        userArr.add(0);
        userArr.add(-11);
        userArr.add(14);
        userArr.add(5);
        userArr.add(7);
        userArr.add(6);
        userArr.add(4);
        System.out.println(userArr);

        minMaxAverage(userArr);

        minMaxAverageViaCollections(userArr);

    }

    private static void minMaxAverage(ArrayList<Integer> userList) {
        Iterator<Integer> col = userList.iterator();
        int min = userList.get(0);
        int max = userList.get(0);
        double res = 0;
        while (col.hasNext()) {
            int i = (Integer) col.next();
            if (i < min)
                min = i;
            if (i > max)
                max = i;
            res = res + i;
        }
        System.out.println("\nВариант 1");
        System.out.printf("Минимальный элемент: %d\n", min);
        System.out.printf("Максимальный элемент: %d\n", max);
        System.out.printf("Среднее арифметическое: %.2f\n", res / userList.size());
    }

    private static void minMaxAverageViaCollections(ArrayList<Integer> userList) {
        System.out.println("\nВариант 2");
        System.out.printf("Максимальный элемент: %d\n", Collections.max(userList));
        System.out.printf("Минимальный элемент: %d\n", Collections.min(userList));
        Double average = userList.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.printf("Среднее арифметическое: %.2f\n", average);
    }
}
