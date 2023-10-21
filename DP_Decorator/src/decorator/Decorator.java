package decorator;

import composants.Boisson;

//pour qu'un decorateur permet de decorer un autre décorateur ou un composant on utilise l'héritage
public abstract class Decorator extends Boisson {
    //un décorateur permet de décorer un composant dans ce cas-la, une boisson
    //symbolise l'aggregation --> signifie que je peux décorer une boisson
    protected Boisson boisson;

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chocolat";
    }

    public Decorator(Boisson boisson){
        this.boisson = boisson;
    }
}
