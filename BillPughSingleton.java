package designPattern.singleton;

// pros: Best Implementation , industry standard

public class BillPughSingleton {


private static class SingletonHelper{
    private static final BillPughSingleton theonlyInstance=new BillPughSingleton();
}

    private BillPughSingleton() {

    }

    public static  BillPughSingleton getInstance() {

        return SingletonHelper.theonlyInstance;
    }
}

class Main5 {
    public static void main(String[] args) {
        BillPughSingleton e1 = BillPughSingleton.getInstance();
        BillPughSingleton e2 = BillPughSingleton.getInstance();

        if (e1 == e2) {
            System.out.println("Objects are Same");
        } else {
            System.out.println("Objects are Different");
        }
    }
}
