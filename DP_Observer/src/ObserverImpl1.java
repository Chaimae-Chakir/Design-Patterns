public class ObserverImpl1 implements Observer {
   /* @Override
    public void update(Observable o) {
         int state=((ObservableImpl)o).getState();
         double res=state*state+9;
         System.out.println("********* ObserverImpl1 ************");
         System.out.println("Nouvelle mise a jour : state="+state);
         System.out.println("Résulat de calcul : "+res);
         System.out.println("************************************");
    }*/

    @Override
    public void update(int state) {
        double res=state*state+9;
        System.out.println("********* ObserverImpl1 ************");
        System.out.println("Nouvelle mise a jour : state="+state);
        System.out.println("Résulat de calcul : "+res);
        System.out.println("************************************");
    }
}
