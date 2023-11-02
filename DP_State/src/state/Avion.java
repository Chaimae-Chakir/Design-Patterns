package state;

public interface Avion {
    void sortirDuGarage();   // Operation de transitions d'etat
    void entrerAuGarage();  // Operation de transitions d'etat
    void decoller();  // Operation de transitions d'etat
    void atterir();  // Operation de transitions d'etat
    void doActivity();// Activity qui prend une duree longue, observable
}
