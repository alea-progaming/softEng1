package simpletonPattern;

import java.sql.SQLOutput;

public class PagibigOffice {
    public static void main(String[] args) {
        // instantiation of Pagibig's centralized queuing system
        QueuingSystem queueSystem = QueuingSystem.getInstance();

        // reproduce customers
        int customer1 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 1 assist queue number " + customer1);

        int customer2 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 2 assist queue number " + customer2);

        int customer3 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 3 assist queue number " + customer3);

        // reset queue number
        int newQueueNumber = 10;
        queueSystem.resetQueueNumber(newQueueNumber);
        System.out.println("---------------------------------");
        System.out.println("|   Queue number reset to: " + newQueueNumber + "   |");
        System.out.println("---------------------------------");

        int customer4 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 1 assist queue number: " + customer4);

        int customer5 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 2 assist queue number: " + customer5);

        int customer6 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 3 assist queue number: " + customer6);

        int customer7 = queueSystem.getNextQueueNumber();
        System.out.println("Help desk 2 assist queue number: " + customer7);
    }
}
