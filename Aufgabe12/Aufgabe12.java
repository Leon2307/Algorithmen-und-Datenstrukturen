package Aufgabe12;

public class Aufgabe12 {
    public static void main(String[] args) {
        ListeL<Integer> list = new ListeL<Integer>();
        list.insert(0);
        list.insert(1);
        list.insert(3);
        list.insert(4);
        list.insert(1);
        list.insert(17);
        
        System.out.println(list);
        System.out.println("Eingegebene Zahl an Position " + list.find1(0));
    }
}
