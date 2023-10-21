package filtrage.strategy;

import filtrage.IFiltrage;

public class FiltrageImpl2 implements IFiltrage {
    @Override
    public int[] filtrer(int[] data) {

        int[] imageFiltre =data;
        for (int i = 0; i <data.length ; i++) {
            imageFiltre[i] = data[i]+4;
        }
        System.out.println("_______________________Application du filtre sur l'image en utilisant l'implémentation 2_______________________");

        return  imageFiltre;
    }
}
