package Aufgabe10;

public class Liste<T> {

    static class ElementL<E> {
        private E element;
        public ElementL<E> next;
        public ElementL<E> prev;

        public ElementL(E o) {
            element = o;
            next = null;
            prev = null;
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
        if (head != null) {
            head.prev = e;
        }
        e.next = head;
        head = e;
        return e;
    }

    // Einfügen an bestimmte Stelle
    public ElementL<T> insert(T o, ElementL<T> pos) {
        ElementL<T> e = new ElementL<T>(o);

        // Sonderfall
        if (pos == null || pos == head) {
            // Am Anfang einfügen
            return insert(o);
        }

        // Einfügen
        pos.prev.next = e;
        e.prev = pos.prev;
        pos.prev = e;
        e.next = pos;

        return e;
    }

    public ElementL<T> remove(ElementL<T> e) {
        if (e == null) {
            return null;
        }

        // Auf Head prüfen
        if (e == head) {
            head = head.next;
            head.prev = null;
            return e;
        }

        // Zu löschendes Element "aushängen"
        e.prev.next = e.next;
        if (e.next != null) {
            e.next.prev = e.prev;
        }
        return e;
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
