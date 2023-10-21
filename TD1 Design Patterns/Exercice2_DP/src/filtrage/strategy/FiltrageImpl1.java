package filtrage.strategy;

import filtrage.IFiltrage;

public class FiltrageImpl1 implements IFiltrage {

    @Override
    public int[] filtrer(int[] data) {
        int[] imageFiltre = new int[data.length];

        for (int i = 0; i <data.length ; i++) {
            imageFiltre[i] = data[i]+2;
        }

        System.out.println("_______________________Application du filtre sur l'image en utilisant l'implémentation 1_______________________");

        return  imageFiltre;
    }
}
