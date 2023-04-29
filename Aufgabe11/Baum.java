package Aufgabe11;

public class Baum {

    private int wert;
    private Baum links;
    private Baum rechts;

    public Baum(int wert) {
        this.wert = wert;
        this.links = null;
        this.rechts = null;
    }

    public void insert(int x) {
        if (this.wert > x) {
            if (this.links == null) {
                this.links = new Baum(x);
            } else {
                links.insert(x);
            }
        } else {
            if (this.rechts == null) {
                this.rechts = new Baum(x);
            } else {
                rechts.insert(x);
            }
        }

    }

    public String toString(){
        String s = "";
        if(this.links != null){
            s += links.toString();
            s += ", ";
        }

        if(this.rechts != null){
            s += rechts.toString();
            s += ", ";
        }

        s += this.wert;

        return s;
    }

    public String toString2(){
        String s = "";
        if(this.links != null){
            s += links.toString2();
            s += ", ";
        }

        s += this.wert;

        if(this.rechts != null){
            s += ", ";
            s += rechts.toString2();
        }

        return s;
    }

}
