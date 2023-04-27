package Aufgabe9;

public class Liste<T> {

    static class ElementL<E> {
        private E element;
        public ElementL<E> next;

        public ElementL(E o) {
            element = o;
            next = null;
        }

    }

    public ElementL<T> head;

    public Liste() {
        head = null;
    }

    public Liste(T o) {
        head = new ElementL<T>(o);
    }

    public ElementL<T> insert(T o) {
        ElementL<T> e = new ElementL<T>(o);
        e.next = head;
        head = e;
        return e;
    }

    public ElementL<T> insert(T o, ElementL<T> pos) {
        ElementL<T> e = new ElementL<T>(o);

        // Sonderfall
        if (pos == null || pos == head) {
            // Am Anfang einfügen
            return insert(o);
        }

        // Vorgänger Bestimmen
        ElementL<T> help = head;
        while (help != null && help.next != pos) {
            help = help.next;
        }

        // Einfügen
        e.next = help.next;
        help.next = e;
        return e;
    }

    public ElementL<T> insert2(T o, ElementL<T> pos) {
        ElementL<T> e = new ElementL<T>(o);

        // Sonderfall
        if (pos == null || pos == head) {
            // Am Anfang einfügen
            return insert(o);
        }

        // Einfügen
        e.next = pos.next;
        pos.next = e;

        // Inhalte tauschen
        T temp = e.element;
        e.element = pos.element;
        pos.element = temp;

        return pos;
    }

    public String toString() {
        String s = "";
        ElementL<T> help = head;
        while (help != null) {
            s += help.element + " ";
            help = help.next;
        }
        return s;
    }
}
