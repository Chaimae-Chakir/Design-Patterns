import state.AvionImpl;

public class Test {
    public static void main(String[] args) {
        AvionImpl avion=new AvionImpl();
        avion.doActivity();
        System.out.println("-------------------------");
        avion.sortirDuGarage();
        avion.doActivity();
        System.out.println("-------------------------");
        avion.entrerAuGarage();
        avion.doActivity();
        System.out.println("-------------------------");
        avion.decoller();
        avion.atterir();
        avion.sortirDuGarage();
        avion.doActivity();
        System.out.println("-------------------------");
        avion.decoller();
        avion.doActivity();
        avion.entrerAuGarage();
        avion.decoller();
        avion.atterir();
        avion.doActivity();
    }
}
