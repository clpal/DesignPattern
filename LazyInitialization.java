package designPattern.singleton;

// pros: Object Created when Required
// cons : Cannot handle multiple threads
public class LazyInitialization {
    private static LazyInitialization theonlyInstance = null;



    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if (theonlyInstance==null){
            theonlyInstance=new LazyInitialization();
        }
        return theonlyInstance;
    }
}

class Main2 {
    public static void main(String[] args) {
        LazyInitialization e1 = LazyInitialization.getInstance();
        LazyInitialization e2 = LazyInitialization.getInstance();

        if (e1 == e2) {
            System.out.println("Objects are Same");
        } else {
            System.out.println("Objects are Different");
        }
    }
}
