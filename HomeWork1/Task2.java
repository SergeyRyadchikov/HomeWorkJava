// Вывести все простые числа от 1 до 1000

package HomeWork1;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList resultList = new ArrayList<ArrayList>();
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
                if (count > 2)
                    break;
            }
            if (count == 2) {
                resultList.add(i);
            }
        }
        System.out.println(resultList);
    }
}
