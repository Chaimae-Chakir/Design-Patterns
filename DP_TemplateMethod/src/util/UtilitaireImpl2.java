package util;

public class UtilitaireImpl2 extends Utilitaire {
    @Override
    public double filtre1(String str) {
        return Math.pow(str.length(),2);
    }

    @Override
    public double filtre2(double d) {
        return d*5;
    }
}
