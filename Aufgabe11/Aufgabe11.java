package Aufgabe11;

import Prog1Tools.IOTools;

public class Aufgabe11 {
    public static void main(String[] args) {
        System.out.println("Gebe so viele Zahlen ein wie du möchtest und breche ab mit der 0");

        int x = IOTools.readInteger("Zahl: ");
        Baum b = new Baum(x);
        while(x!=0){
            x = IOTools.readInteger("Zahl: ");
            b.insert(x);
        }
        System.out.println(b.toString2());
    }
}
