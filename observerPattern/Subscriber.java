package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements SubObserver{

    public String subName;
    public List<Subscriber> sub;

    public List<Subscriber> getSub() {
        return sub;
    }

    public void setSub(List<Subscriber> sub) {
        this.sub = sub;
    }

    public Subscriber() {
        sub = new ArrayList<>();
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
        //sub.add(subName);
    }

    @Override
    public void subscribe(Subscriber subName) {
        sub.add(subName);
    }

    @Override
    public void unsubscribe(Subscriber subName) {
        sub.remove(subName);
    }

    @Override
    public void newsUpdate(NewsAgency newsAgency){

    }

}
