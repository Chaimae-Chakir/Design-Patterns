package state;

public abstract class State{
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }
    abstract void executeSortirDuGarage();   //
    abstract void executeEntrerAuGarage();  // Operation de transitions d'etat
    abstract void executeDecoller();  // Operation de transitions d'etat
    abstract void executeAtterir();  // Operation de transitions d'etat
    abstract void executeDoActivity();// Activity qui
}