package decorator;

import composants.Boisson;

public class Caramel extends Decorator{

    // on crée un chocolat pour décorer une boisson
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return  boisson.getDescription()+"Au caramel ";
    }

    @Override
    public double cout() {
        return 0.8+boisson.cout();
    }
}
