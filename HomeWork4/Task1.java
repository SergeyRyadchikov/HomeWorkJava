// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        int repeat = 10;
        LinkedList<Object> userList = createLinkedList(repeat);
        System.out.println(userList);
        userList = reversList(userList);
        System.out.println(userList);
        
    }

    private static LinkedList<Object> createLinkedList(int size) {
        LinkedList<Object> resultList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            resultList.add(i + "abc");
        }
        return resultList;
    }

    private static LinkedList<Object> reversList(LinkedList<Object> linkedList){
        LinkedList<Object> reversList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++){
            reversList.addFirst(linkedList.get(i));
        }
        return reversList;
    }
}
