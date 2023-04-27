package Aufgabe9;

public class Aufgabe9 {
    public static void main(String[] args) {
        Liste<Integer> list = new Liste<Integer>();

        list.head = new Liste.ElementL<Integer>(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert2(10, list.head);
        System.out.println(list);
    }
}
