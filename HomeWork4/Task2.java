// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очередии удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;


public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> userList = createLinkedList(10);
        System.out.println(userList);
        userList = enqueue(userList, 2);
        System.out.println(userList);
        userList = enqueue(userList, 4);
        System.out.println(userList);
        int firstElement = dequeue(userList);
        System.out.println(firstElement);
        System.out.println(userList);
        firstElement = first(userList);
        System.out.println(firstElement);
        System.out.println(userList);

    }

    private static LinkedList<Integer> createLinkedList(int size) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            resultList.add(i);
        }
        return resultList;
    }

    private static LinkedList<Integer> enqueue(LinkedList<Integer> userList, int index) {
        userList.addLast(userList.remove(index));
        return userList;
    }

    private static int dequeue(LinkedList<Integer> uList){
        return uList.pollFirst();
    }

    private static int first(LinkedList<Integer> uList){
        return uList.getFirst();
    }

}
