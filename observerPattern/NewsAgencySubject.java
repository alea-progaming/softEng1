package observerPattern;

public interface NewsAgencySubject {
    public void notifySubscribers(String newsUpdate, String category);
    public void addSubscribe(Subscriber subName, String category);
    public void removeSubscribe(Subscriber subName, String category);
}
