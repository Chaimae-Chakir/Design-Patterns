import metier.IMetierImpl;
import presentation.Presentation;
import proxy.Proxy;
import proxy.ProxySecurity;

public class Main {
    public static void main(String[] args) {
        /*Presentation presentation=new Presentation();
        presentation.setMetier(new IMetierImpl());
        presentation.traitement(45);*/

        /*Presentation presentation=new Presentation();
        presentation.setMetier(new Proxy());
        presentation.traitement(45);
        presentation.traitement(15);
        presentation.traitement(15);*/

        ProxySecurity.password="1234";
        Presentation presentation=new Presentation();
        presentation.setMetier(new ProxySecurity());
        presentation.traitement(45);
        presentation.traitement(15);
        presentation.traitement(15);
    }
}