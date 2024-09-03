// Class imports
import java.util.Map;

// Create record for cash denominations.
record Denomination (String name, double amt, String form, String img) { }

public class Purse {

    // Attributes
    Map<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    // Accessors / Mutators
    static double getValue() {

        return 0.0;

    }

    static void add (Denomination type, int num) {



    }

    static double remove (Denomination type, int num) {

        return 0.0;

    }

}