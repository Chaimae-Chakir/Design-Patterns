package filtrage.adapter;

import filtrage.IFiltrage;

public class FiltrageImpl3 implements IFiltrage {

    private ImplNonStandard implNonStandard = new ImplNonStandard();

    @Override
    public int[] filtrer(int[] data) {
        return implNonStandard.appliquerFiltre("FiltrageImpl3",data);
    }
}
