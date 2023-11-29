package observerPattern;
import java.util.List;

public class NewsAgency implements NewsAgencySubject, SubObserver{
    private List<Subscriber> subscriber;
    private String news;

    public List<Subscriber> getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(List<Subscriber> subscriber) {
        this.subscriber = subscriber;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        for (Subscriber sub : subscriber) {
            output += "Hey, " + sub.getSubName() + "!\n";
            output += news + ": Former CEO of OpenAI, Sam Altman, has been re-hired after being fired for 4 days." + "\n\n";
        }
        return output;
    }

    @Override
    public void subscribe(Subscriber subName) {
        subscriber.add(subName);
    }

    @Override
    public void unsubscribe(Subscriber subName) {
        subscriber.remove(subName);
    }

    @Override
    public void newsUpdate(NewsAgency newsAgency) {

    }


}
