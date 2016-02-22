/**
 * Created by ericweidman on 2/22/16.
 */
public class AnonFunctionExample {
    public static void main(String[] args) {
        //run code from seperate method
        sayHello();

        //Run code from anon class.
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Hello from anonymous class.");
            }
        };
        r1.run();

        // Run code from an anon function.
        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function.");
        };
        r2.run();
    }

    static void sayHello(){
        System.out.println("Hello world!");
    }
}
