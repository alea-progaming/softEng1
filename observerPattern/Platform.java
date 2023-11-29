package observerPattern;

import java.util.*;

public class Platform {
    public static void main(String[] args) {
        Subscriber jerry = new Subscriber();
        jerry.setSubName("Jerry");

        Subscriber mark = new Subscriber();
        mark.setSubName("Mark");

        Subscriber mars = new Subscriber();
        mars.setSubName("Mars");

        Subscriber dan = new Subscriber();
        dan.setSubName("Dan");

        List<Subscriber> subList = new ArrayList<>();
        subList.add(jerry);
        subList.add(mark);
        subList.add(mars);
        subList.add(dan);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setSubscriber(subList);
        newsAgency.setNews("Tech News");

        System.out.println("BREAKING NEWS");
        System.out.println(newsAgency.notifySubscribers());

        //System.out.println("Mark unsubscribed.");
        Subscriber subscribers = new Subscriber();
        
        //should be subscribers.unsubscribe(mark);
        newsAgency.unsubscribe(dan);
        subList.remove(mark);

        System.out.println("BREAKING NEWS");
        //System.out.println(subscribers);
        System.out.println(newsAgency.notifySubscribers());
    }
}
