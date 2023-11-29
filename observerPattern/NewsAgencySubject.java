package observerPattern;

public interface NewsAgencySubject {
    public String notifySubscribers();
    public void subscribe(Subscriber subName);
    public void unsubscribe(Subscriber subName);
}
