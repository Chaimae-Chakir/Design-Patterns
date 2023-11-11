package org.example;

public class ImplNonStandard {

    public int[] appliquerFiltre(String filterName, int[] data){
        int[] resultat = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            resultat[i] = data[i] * 4;
        }
        return resultat;
}
}

