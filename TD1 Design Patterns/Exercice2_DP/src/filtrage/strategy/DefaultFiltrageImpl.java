package filtrage.strategy;

import filtrage.IFiltrage;

public class DefaultFiltrageImpl implements IFiltrage {

    @Override
    public int[] filtrer(int[] data) {

        int[] imageFiltre =data;
        for (int i = 0; i <data.length ; i++) {
            imageFiltre[i] = data[i]+6;
        }
        System.out.println("_______________________Application du filtre sur l'image en utilisant le filtre par défaut_______________________");


        return  imageFiltre;
    }
}
