// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод (не void), который вернет “перевернутый” список.

import java.util.LinkedList;
public class decision_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        list.add("0");
        list.add("4");

        System.out.println("Исходный список: " + list);
        LinkedList<String> perevertishList = perevertishLinkedList(list);
        System.out.println("Перевернутый список: " + perevertishList);
    }

    public static LinkedList<String> perevertishLinkedList(LinkedList<String> list) {
        LinkedList<String> perevertishList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            perevertishList.add(element);
        }
        return perevertishList;
    }
}

