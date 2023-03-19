// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
public class decision_2 {
    public static void main(String[] args) {
        int[] list = {2, 4, 3, 5, 7, 6};
        LinkedList<Integer> linkList = new LinkedList<>();
        
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println("Начальный список: " + linkList);

        enqueue(linkList, 20);              
        System.out.println("Список с элементом, добавленным в конец очереди: " + linkList);

        System.out.println("Возвращенный первый элемент: " + dequeue(linkList));
        System.out.println("Список с удаленным первым элементом: " + linkList);

        System.out.println("Возвращенный первый элемент без его удаления: " + first(linkList));
        System.out.println("Итоговый список: " + linkList);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {   // первый метод
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {             // второй метод
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {               // третий метод
        int num = 0;
        num = list.get(0);
        return num;
    }
}

