package Aufgabe10;

public class Aufgabe10 {
    public static void main(String[] args) {
        Liste<Integer> l = new Liste<Integer>();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(10, l.head.next.next.next.next);
        l.remove(l.head);
        System.out.println(l);
    }
}
