public interface Observable {
    public void subscribe(Observer o);//add observer
    public void unsubscribe(Observer o);//remove observer
    public void notifyObservers();
}
