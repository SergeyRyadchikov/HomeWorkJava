package HomeWork3;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
// import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> userArr = new ArrayList<Integer>();
        userArr.add(3);
        userArr.add(0);
        userArr.add(11);
        userArr.add(14);
        userArr.add(5);
        userArr.add(7);
        userArr.add(6);
        userArr.add(4);
        System.out.println(userArr);

        // Вариант через removeIF 
        userArr.removeIf(i -> i % 2 == 0);
        System.out.println(userArr);

        // Вариант через итератор
        // Iterator<Integer> col = userArr.iterator();
        // while (col.hasNext()) {
        //     int y = (Integer) col.next();
        //     if (y % 2 == 0)
        //         col.remove();
        // }
        // System.out.println(userArr);
    }
}
