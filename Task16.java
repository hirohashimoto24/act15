// Interface as provided
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Gorilla class implementing Animal
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Gorilla is eating.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is grooming.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You tried to pet the gorilla!");
    }
}

// Test class
public class Task16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        g.feed(true);
        g.groom();
        g.pet();
    }
}
