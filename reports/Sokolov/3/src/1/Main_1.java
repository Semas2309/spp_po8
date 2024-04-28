import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        VariablePowerSet set1 = new VariablePowerSet();
        set1.addElement('a');
        set1.addElement('b');
        set1.addElement('c');

        VariablePowerSet set2 = new VariablePowerSet();
        set2.addElement('b');
        set2.addElement('c');
        set2.addElement('d');

        VariablePowerSet intersectionSet = set1.intersection(set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
