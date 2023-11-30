package observerPattern;

import java.util.*;

public class Platform {
    public static void main(String[] args) {
        // Create News Agency
        NewsAgency newsAgency = new NewsAgency();

        // Create subscribers
        Subscriber sub1 = new Subscriber("Annabeth");
        Subscriber sub2 = new Subscriber("Jerry");
        Subscriber sub3 = new Subscriber("Mars");
        Subscriber sub4 = new Subscriber("James");

        // Point subscribers to chosen specified categories
        newsAgency.addSubscribe(sub1, "Weather");
        newsAgency.addSubscribe(sub2, "Tech");
        newsAgency.addSubscribe(sub3, "Election");

        System.out.println("--------------------------------------------------------------------");

        // Agency publishes news
        newsAgency.publishNewsUpdate("After being fired for less than a week, Sam Altman, CEO of OpenAI, is finally re-hired.", "Tech");
        newsAgency.publishNewsUpdate("New typhoon coming from the East", "Weather");
        newsAgency.publishNewsUpdate("Previous President has been disqualified to be a candidate again for President.", "Election");

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        // sub1 unsubscribed from Weather category
        newsAgency.removeSubscribe(sub1, "Weather");

        // sub1 subscribed to Tech, sub4 subscribed to weather
        newsAgency.addSubscribe(sub1, "Tech");
        newsAgency.addSubscribe(sub4, "Weather");


        System.out.println("--------------------------------------------------------------------");

        // Agency published new news update
        newsAgency.publishNewsUpdate("Today will be sunny with 30% humidity.", "Weather");
        newsAgency.publishNewsUpdate("Microsoft will integrate Python in Excel to be part of it's built-in connectors and Power Query.", "Tech");
        newsAgency.publishNewsUpdate("The results are finally out. Noah Schnapp is the new President with [numbers] of vote.", "Election");
    }
}