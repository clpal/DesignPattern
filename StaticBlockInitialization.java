package designPattern.singleton;
// pros: Exception Handling is handled
// cons : Object always created
public class StaticBlockInitialization {
    private static StaticBlockInitialization theonlyInstance = null;
    static {
        try {
            theonlyInstance = new StaticBlockInitialization();
        }
        catch ( Exception e){
e.printStackTrace();
        }

    }

    private StaticBlockInitialization() {

    }

    public static StaticBlockInitialization getInstance() {
        return theonlyInstance;
    }
}

class Main1{
    public static void main(String[] args) {
      StaticBlockInitialization e1=  StaticBlockInitialization.getInstance();
      StaticBlockInitialization e2=  StaticBlockInitialization.getInstance();

        if (e1 == e2) {
            System.out.println("Objects are Same");
        }
        else{
            System.out.println("Objects are Different");
        }
    }
}
