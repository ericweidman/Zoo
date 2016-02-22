/**
 * Created by ericweidman on 2/22/16.
 */
public class AnonClassExample {
    public static void main(String[] args) {
        Reptile alligator = new Reptile() {
            @Override
            public void makeSound() {
                super.makeSound();
                System.out.println("Croak");
            }
        };
        alligator.name = "Alligator";
        alligator.makeSound();
    }
}
