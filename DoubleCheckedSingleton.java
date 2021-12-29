package designPattern.singleton;

// pros: Better Performance
// cons :Performance is slow till first object created
public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton theonlyInstance = null;



    private DoubleCheckedSingleton() {

    }

    public static  DoubleCheckedSingleton getInstance() {
        if (theonlyInstance==null){
            synchronized (DoubleCheckedSingleton.class){
                if (theonlyInstance == null) {
                    theonlyInstance=new DoubleCheckedSingleton();
                }

            }

        }
        return theonlyInstance;
    }
}

class Main4 {
    public static void main(String[] args) {
        DoubleCheckedSingleton e1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton e2 = DoubleCheckedSingleton.getInstance();

        if (e1 == e2) {
            System.out.println("Objects are Same");
        } else {
            System.out.println("Objects are Different");
        }
    }
}
