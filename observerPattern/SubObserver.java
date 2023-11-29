package observerPattern;

public interface SubObserver {
    public void subscribe(Subscriber subName);
    public void unsubscribe(Subscriber subName);
    public void newsUpdate(NewsAgency newsAgency);
}
