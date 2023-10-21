package presentation;

import metier.IMetier;

public class Presentation {
    private IMetier metier;

    public void traitement(int n){
        double res=metier.calcul(n);
        System.out.println("********************");
        System.out.println("Pour "+n+"=>"+res);
        System.out.println("********************");
    }

    public void setMetier(IMetier metier) {
        this.metier = metier;
    }
}