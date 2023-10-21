package decorator;

import composants.Boisson;

public class Chocolat extends Decorator{

    // on crée un chocolat pour décorer une boisson
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return  boisson.getDescription()+"Au chocolat ";
    }

    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
