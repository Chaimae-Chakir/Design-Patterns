package state;

public class EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de Sortir du garage, je suis deja en piste");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Transition d'état de En piste => Garage");
        //dans le cas de state est prive et non pas protected -->avion.setState(new EtatAuGarage(avion))
        avion.state = new EtatAuGarage(avion);
    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'état de En piste => En air");
        avion.state = new EtatEnAir(avion);
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible , je suis deja en piste");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en piste....");
        }
    }
}
