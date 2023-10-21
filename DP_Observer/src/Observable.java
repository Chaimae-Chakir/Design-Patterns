public interface Observable {
    void subscribe(Observer o);//add observer
    void unsubscribe(Observer o);//remove observer
    void notifyObservers();
}
