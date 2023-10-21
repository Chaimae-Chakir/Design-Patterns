import util.*;

public class Main {
    public static void main(String[] args) {
        Utilitaire utilitaire=new UtilitaireImpl();
        System.out.println(utilitaire.compute("azerty"));


        utilitaire=new UtilitaireImpl2();
        System.out.println(utilitaire.compute("azerty"));
    }
}