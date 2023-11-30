package observerPattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsAgency implements NewsAgencySubject {
    private Map<String, List<Subscriber>> subscribersByCategory = new HashMap<>();

    @Override
    public void addSubscribe(Subscriber subName, String category) {
        subscribersByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(subName);
        System.out.println(subName.getName() + " subscribed to " + category + " news updates.");
    }

    @Override
    public void removeSubscribe(Subscriber subName, String category) {
        subscribersByCategory.getOrDefault(category, new ArrayList<>()).remove(subName);
    }

    @Override
    public void notifySubscribers(String newsUpdate, String category) {
        List<Subscriber> subscribers = subscribersByCategory.getOrDefault(category, new ArrayList<>());
        for (Subscriber subscriber : subscribers) {
            subscriber.update(newsUpdate);
        }
    }

        public void publishNewsUpdate(String newsUpdate, String category){
            System.out.println("\nNews Agency : New " + category + " update - " + newsUpdate);
            notifySubscribers(newsUpdate, category);
        }



}
