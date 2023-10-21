public class ObserverImpl2 implements Observer {
    private int counter;

    /*@Override
    public void update(Observable o) {
        int state=((ObservableImpl)o).getState();
        if(state%2==0) ++counter;
        System.out.println("********* ObserverImpl2 ************");
        System.out.println("Nouvelle mise a jour : state="+state);
        System.out.println("Résulat de calcul : "+((state%2==0)?"Paire":"Impaire"));
        System.out.println("Le compteur est :"+counter);
        System.out.println("************************************");
    }*/

    @Override
    public void update(int state) {
        if(state%2==0) ++counter;
        System.out.println("********* ObserverImpl2 ************");
        System.out.println("Nouvelle mise a jour : state="+state);
        System.out.println("Résulat de calcul : "+((state%2==0)?"Paire":"Impaire"));
        System.out.println("Le compteur est :"+counter);
        System.out.println("************************************");
    }
}
