package designPattern.singleton;
// prons: Only one object is created
// cons: Exception handled is not handled
public class EagerInitialization {
    private static EagerInitialization theonlyInstance = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return theonlyInstance;
    }
}
class Main{
    public static void main(String[] args) {
        EagerInitialization e1=  EagerInitialization.getInstance();
        EagerInitialization e2=  EagerInitialization.getInstance();
      //EagerInitialization eagerInitialization=new EagerInitialization();// error
        if (e1 == e2) {
            System.out.println("Objects are Same");
        }
        else{
            System.out.println("Objects are Different");
        }
    }
}
