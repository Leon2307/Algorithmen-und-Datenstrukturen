package Aufgabe20;

public class Aufgabe20 {
    public static void main(String[] args) {
        KettenStapel ks = new KettenStapel<Integer>();

        ks.push(1);
        ks.push(2);
        ks.push(3);
        ks.pop();
        ks.push(4);
        ks.push(5);

        System.out.println(ks);
    }
}
