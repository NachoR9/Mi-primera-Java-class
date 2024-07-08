package dev.nacho;
import dev.nacho.models.*;;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       Person Nacho = new Person ("Nacho", "Rodriguez", "87653422P", 1986, "España", 'H');
       Nacho.print();
    }
}


