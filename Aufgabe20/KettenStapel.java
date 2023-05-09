package Aufgabe20;

public class KettenStapel<T> {

    Element<T> start;
    Element<T> end;

    class Element<S> {
        Element<S> next;
        S value;

        public Element(S val) {
            this.value = val;
            this.next = null;
        }

    }

    public void push(T o) {

        Element<T> element = new Element<T>(o);

        if(start == null){
            start = element;
            end = element;
        } else {
            end.next = element;
            end = element;
        }
    }

    public Element<T> pop(){
        Element<T> element = new Element(1);
        return element;
    }

    public String toString(){
        String s = "";
        Element<T> temp = start;
        while(temp != null){
            s += temp;
            temp = temp.next;
        }
        return s;
    }

}
