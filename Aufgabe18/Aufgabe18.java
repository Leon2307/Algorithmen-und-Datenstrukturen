package Aufgabe18;

import java.util.TreeSet;

import Prog1Tools.IOTools;

public class Aufgabe18 {
    public static void main(String[] args) {

        int n = IOTools.readInt("Gebe ein n ein: ");
        TreeSet<Integer> t = new TreeSet<Integer>();
        TreeSet<Integer> s = new TreeSet<Integer>();

        for (int i = 2; i <= n; i++) {
            t.add(i);
        }

        int p = 2;

        do {
            for (int i = 2; i <= n; i++) {
                s.add(i * p);
            }
            if (p == 2) {
                p = 3;
            } else {
                do {
                    p += 2;
                } while (s.contains(p));
            }

        } while (Math.pow(p, 2) <= n);

        t.removeAll(s);

        int zaehler = 0;
        for(Integer num: t){
            System.out.print(num + " ");
            zaehler++;
            if(zaehler%10 == 9){
                System.out.println();
            }
        }

    }
}
