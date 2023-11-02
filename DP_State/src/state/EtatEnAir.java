package state;

public class EtatEnAir extends State{

    public EtatEnAir(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage , je suis en l'air");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible d'entrer au garage , je suis en l'air");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de decoller , je suis deja en l'air");
    }

    @Override
    void executeAtterir() {
        System.out.println("Transition d'état de En l'air => Piste");
        avion.state=new EtatEnPiste(avion);
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i <10; i++) {
            System.out.println("Activité de l'etat en l'air....");
        }
    }
}