import java.util.Random;

public class Proxy implements Standard {
    private StandardImpl1 target;

    @Override
    public void process() {
        System.out.println("Vérification du contexte de sécurité");
        boolean b=new Random().nextBoolean();
        if(b) {
            System.out.println("Avant l'appel");
            target=new StandardImpl1();
            target.process();
            System.out.println("Apres l'appel");
        }
        else throw new RuntimeException("Forbidden 403");
    }
}
