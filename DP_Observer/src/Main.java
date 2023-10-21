public class Main {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Observer o1= new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl1();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
        observable.setState(55);
        observable.setState(30);
        observable.unsubscribe(o1);
        /*observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                System.out.println("Observateur anonyme1!");
            }
        });*/
        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("Observateur anonyme1!");
            }
        });
        observable.subscribe(o -> System.out.println("Observateur anonyme2!"));
        observable.setState(33);
    }
}