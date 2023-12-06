package simpletonPattern;

public class QueuingSystem {
    private static QueuingSystem instance;

    private int currentQueueNumber;

    private QueuingSystem() {
        currentQueueNumber = 1;
    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null)
            instance = new QueuingSystem();
        return instance;
    }

    // method for next queue number
    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
    }
}
