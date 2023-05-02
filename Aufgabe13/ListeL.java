package Aufgabe13;

public class ListeL<I extends Comparable<I>> {

  static class ElementL<K> {
    private K inhalt; // Inhalt des Listenelements
    private ElementL<K> next; // Verweis auf den Nachfolger

    public ElementL(K o) {
      inhalt = o;
      next = null;
    }
  }

  private ElementL<I> head; // Referenz auf den Anfang der Liste

  public ListeL() {
    head = null;
  }

  public ListeL(I o) {
    head = new ElementL<I>(o);
  }

  public ElementL<I> insert(I o) { // am Anfang einf�gen
    ElementL<I> newEl = new ElementL<I>(o);
    if (head == null) { // Liste ist noch leer
      head = newEl;
    } else {
      newEl.next = head;
      head = newEl;
    }
    return newEl;
  }

  public ElementL<I> insert(I o, ElementL<I> pred) { // nach pred (Vorg�nger) einf�gen
    ElementL<I> newEl = new ElementL<I>(o);
    if (pred == null) { // am Anfang einf�gen
      newEl.next = head;
      head = newEl;
    } else { // nach pred (Vorg�nger) einf�gen
      newEl.next = pred.next;
      pred.next = newEl;
    }
    return newEl;
  }

  public void remove(ElementL<I> pred) { // Element nach pred (Vorg�nger) l�schen
    if (pred == null) // erstes Element l�schen
      head = head.next;
    else if (pred.next != null) // Element nach pred (Vorg�nger) l�schen
      pred.next = pred.next.next;
  }

  public String toString() {
    String s = "(";
    ElementL<I> help = head;
    while (help != null && help.next != null) {
      s = s + help.inhalt + ", ";
      help = help.next;
    }
    if (help != null)
      s = s + help.inhalt;
    return s + ")";
  }

  // Aufgabe 12

  public int find1(I o) {
    ElementL<I> help = head;
    int count = 0;
    while (help != null) {
      if (help.inhalt.compareTo(o) == 0) {
        return count;
      }
      count++;
      help = help.next;
    }
    // Falls o nicht in Liste
    return -1;
  }

  // Aufgabe 13

  public void sort1() {
    for (int i = 0; i < this.length()-1; i++) {
      for(int j = i+1; j < this.length(); j++){
        // nach kleinstem Element suchen
        ElementL<I> minElement = this.getElement(i);
        ElementL<I> jElement = this.getElement(j);
        if(jElement.inhalt.compareTo(minElement.inhalt) < 0){
          //Werte tauschen
          I help = minElement.inhalt;
          minElement.inhalt = jElement.inhalt;
          jElement.inhalt = help;
        }
      }
    }
  }

  private ElementL<I> getElement(int pos){
    ElementL<I> help = head;
    for(int i = 0; i<pos;i++){
      help = help.next;
    }
    return help;
  }

  private int length() {
    int count = 0;
    ElementL<I> help = head;
    while (help != null) {
      count++;
      help = help.next;
    }

    return count;
  }
  // Ende Aufgabe 13

  // Test

  public static void main(String[] args) {
    ListeL<Integer> l = new ListeL<Integer>();
    l.insert(0);
    ElementL<Integer> eins = l.insert(new Integer(1));
    l.insert(3);
    System.out.println(l);
    l.insert(2, eins); // nach eins einf�gen
    System.out.println(l);
    l.remove(eins); // Nachfolger von eins l�schen
    System.out.println(l);
  }

}
