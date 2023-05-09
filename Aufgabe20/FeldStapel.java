package Aufgabe20;

public class FeldStapel<T> {

    T[] array;
    int lastIndex;

    public FeldStapel(int length) {
        array = (T[]) new Object[length];
        lastIndex = 0;
    }

    public void push(T n) {
        array[lastIndex++] = n;
    }

    public T pop() {
        T temp = array[lastIndex];
        array[lastIndex] = null;
        return temp;
    }

}
