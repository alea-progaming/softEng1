package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements SubObserver{

    public String subName;

    public Subscriber(String name) {
        this.subName = name;
    }

    @Override
    public String getName() {
        return subName;
    }

    @Override
    public void update(String newsUpdate){
        System.out.println(subName + " received news update: " + newsUpdate);
    }

}
