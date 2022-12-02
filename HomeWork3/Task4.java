package HomeWork3;

// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:

// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой

// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй,
// которых нет в первой

import java.util.ArrayList;
import java.util.Random;


public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = createList(8);
        ArrayList<Integer> list2 = createList(8);
        System.out.println(list1 + "\n" + list2);
        System.out.printf("\nA - B %s", difAB(list1, list2));
        System.out.printf("\nB - A %s", difAB(list2, list1));
        System.out.printf("\nA ^ B %s", simmetricDif(difAB(list1, list2), difAB(list2, list1)));
    }

    private static ArrayList<Integer> createList(int size) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10));
        }
        return list;
    }

    private static ArrayList<Integer> difAB(ArrayList<Integer> userList1, ArrayList<Integer> userList2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int count = 0;
        for (int i : userList1) {
            for (int j : userList2) {
                if (i == j)
                    count++;
            }
            if (count == 0){
                resultList.add(i);
            }
            count = 0;
        }
        return resultList;
    }

    private static ArrayList<Integer> simmetricDif (ArrayList<Integer> userList1, ArrayList<Integer> userList2){
        for (int i : userList2){
            userList1.add(i);
        }
        return userList1;
    }
}
