package state;

public class EtatAuGarage extends State{

    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Transition d'état du Garage => Piste");
        avion.state=new EtatEnPiste(avion);
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible , je suis deja au Garage ");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible , je suis deja au Garage");
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible , je suis deja au Garage");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i <10; i++) {
            System.out.println("Activité de l'état au garage....");
        }
    }
}