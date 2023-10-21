package util;

public abstract class Utilitaire {
    public double compute(String str){
        int size=str.length();
        double resultat=0;
        for (int i = 0; i <size ; i++) {
            double x=filtre1(str);
            resultat+=i*x;
            double y=filtre2(resultat);
            resultat+=y*resultat;
        }
        return resultat;
    }

    protected abstract double filtre1(String str);
    protected abstract double filtre2(double d);

}
