package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverDPTest {
    // https://www.youtube.com/watch?v=4hP86WUavXs&list=PLzte2IQYFUVHN5U0WJW5Ht0T82kL6x3zi
    public static void main(String[] args) {
        Subject implSubject = new SubjectImpl();
        List<Observer> observers = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {

            observers.add(new ObserverImpl("observer -" + i));
        }
        for (Observer observer : observers) {
            implSubject.register(observer);
            observer.setSubject(implSubject);
        }
        observers.get(0).update();
        implSubject.postMessage("This is Observer design pattern Posted by Chhote Lal Pal");
    }
}
