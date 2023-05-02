package Aufgabe14;

public class Aufgabe14 {
    public static void main(String[] args) {
        ListeL<Integer> liste = new ListeL<Integer>();

        for (int i = 0; i < 20; i++) {
            liste.insert((int) (Math.random() * 100));
        }

        System.out.println(liste);
        liste.sort2();
        System.out.println(liste);
    }
}
