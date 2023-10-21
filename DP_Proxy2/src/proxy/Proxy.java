package proxy;

import metier.IMetier;
import metier.IMetierImpl;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements IMetier {
    private Map<Integer,Double> cache=new HashMap<>();
    private IMetierImpl metier=new IMetierImpl();
    @Override
    public double calcul(int x) {
        Double data=cache.get(x);
        if(data!=null) {
            System.out.println("From cache");
            return data;
        }
        else {
            double res = metier.calcul(x);
            cache.put(x,res);
            System.out.println("From Metier");
            return res;
        }
    }
}
