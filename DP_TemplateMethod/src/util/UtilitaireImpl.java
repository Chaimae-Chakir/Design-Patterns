package util;

public class UtilitaireImpl extends Utilitaire {
    @Override
    public double filtre1(String str) {
        return Math.pow(str.length(),4);
    }

    @Override
    public double filtre2(double d) {
        return d*2;
    }
}
