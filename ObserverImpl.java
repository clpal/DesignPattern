package designPattern.observer;

public class ObserverImpl implements Observer {
    String observerName;
    Subject subjectRegistered;

    public ObserverImpl(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        String newMessage = (String) subjectRegistered.getUpdate();
        if (newMessage != null) {
            System.out.println(observerName + "New Message received" + newMessage);
        } else {
            System.out.println(observerName + "no message received");
        }
    }

    @Override
    public void update(String newMessage) {
        if (newMessage != null) {
            System.out.println(observerName + "New Message received" + newMessage);
        } else {
            System.out.println(observerName + "no message received");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        subjectRegistered = subject;
    }
}
