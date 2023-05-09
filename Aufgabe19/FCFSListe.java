package Aufgabe19;

public class FCFSListe implements WarteSchlange{

    private ZPatient endPatient;
    private ZPatient startPatient;

    @Override
    public void anmelden(ZPatient p) {
      if (startPatient == null) {
        startPatient = p;
        endPatient = p;
      } else {
        endPatient.next = p;
        endPatient = p;
      }
    }

    @Override
    public ZPatient derNaechsteBitte() {
        if(startPatient != null) {
            ZPatient temp = startPatient;
            startPatient = startPatient.next;
            return temp;
        } else {
            return null;
        }
    }
    
}
