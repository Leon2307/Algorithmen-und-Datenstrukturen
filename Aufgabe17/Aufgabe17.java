package Aufgabe17;

import java.util.TreeSet;

public class Aufgabe17 {

    static TreeSet<Integer> lotto = new TreeSet<Integer>();

    public static void main(String[] args) {

        // 7 Zahlen generieren und in Set einfügen
        for (int i = 0; i < 7; i++) {
            int num = (int) (Math.random() * 49);
            if (!lotto.add(num)) {
                i--;
            };
        }

        System.out.println(lotto);

    }
}
