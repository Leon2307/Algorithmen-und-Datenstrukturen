package Aufgabe8;

public class Aufgabe8 {

    public static void main(String[] args) {
        Liste<Integer> l = new Liste<Integer>(5);
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.remove();
        l.remove();
        l.insert(1);
        l.remove();
        l.remove();
        System.out.println(l);
    }
    
}