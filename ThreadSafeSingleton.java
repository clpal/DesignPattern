package designPattern.singleton;

// pros: Multiple Threads handled
// cons :Performance is slow
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton theonlyInstance = null;



    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (theonlyInstance==null){
            theonlyInstance=new ThreadSafeSingleton();
        }
        return theonlyInstance;
    }
}

class Main3 {
    public static void main(String[] args) {
        ThreadSafeSingleton e1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton e2 = ThreadSafeSingleton.getInstance();

        if (e1 == e2) {
            System.out.println("Objects are Same");
        } else {
            System.out.println("Objects are Different");
        }
    }
}
