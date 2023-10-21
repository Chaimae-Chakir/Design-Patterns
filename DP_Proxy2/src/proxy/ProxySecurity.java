package proxy;

import metier.IMetier;
import metier.IMetierImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxySecurity implements IMetier {
    public static String password="";
    private IMetierImpl metier=new IMetierImpl();
    @Override
    public double calcul(int x) {
        if(password.equals("1234")){
            double res= metier.calcul(x);
            return res;
        }
        throw new RuntimeException("Not authorized");
    }
}
