package decorator;

import composants.Boisson;

public class Noisette extends Decorator{

    // on crée un chocolat pour décorer une boisson
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return  boisson.getDescription()+"Au Noisette ";
    }

    @Override
    public double cout() {
        return +boisson.cout();
    }
}
