// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет
// повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
package HomeWork5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        Map<String, Integer> personal = new HashMap<>();
        people.add("Jack");
        people.add("Jack");

        people.add("Alice");
        people.add("Alice");
        people.add("Alice");

        people.add("Kate");
        people.add("Kate");
        people.add("Kate");

        people.add("Sam");
        people.add("Sam");

        people.add("Tom");

        people.add("Nikola");

        String temp = people.get(0);
        int count = 0;
        for (int i = 0; i < people.size(); i++)
            if (temp.equals(people.get(i))) {
                count++;
            } else {
                personal.put(temp, count);
                temp = people.get(i);
                count = 1;
                if (i == people.size() - 1)
                    personal.put(temp, count);

            }

        System.out.println(sortByValues(personal));

    }

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0)
                    return 1;
                else
                    return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

}
