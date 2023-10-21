package metier;

public class IMetierImpl implements IMetier {

    @Override
    public double calcul(int x) {
        double res=50*x*x/3;
        return res;
    }
}
