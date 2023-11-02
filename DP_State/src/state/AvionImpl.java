package state;

public class AvionImpl implements Avion {
    protected State state;

    public AvionImpl() {
        //état initial
        state = new EtatEnPiste(this);
    }

    @Override
    public void sortirDuGarage() {
      state.executeSortirDuGarage();//deleguer
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();//déléguer par composition
    }

    @Override
    public void decoller() {
        state.executeDecoller();//déléguer par composition
    }

    @Override
    public void atterir() {
        state.executeAtterir();//déléguer par composition
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();//déléguer par composition
    }

}

