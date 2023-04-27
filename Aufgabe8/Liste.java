package Aufgabe8;

public class Liste<T> {
    
    int firstIndex = 0;
    int lastIndex = 0;
    int size;
    T[] list;

    public Liste(int len){
        list = (T[]) new Object[len];
        size = len;
    }

    public void insert(T t){
        list[(firstIndex++)%size] = t;
    }

    public void remove(){
        list[(lastIndex++)%size] = null;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < size; i++){
            s += list[i] + " ";
        }
        return s;
    }
}
