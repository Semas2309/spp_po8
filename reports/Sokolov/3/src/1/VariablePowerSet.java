import java.util.ArrayList;
import java.util.Objects;

public class VariablePowerSet {
    private ArrayList<Character> set;

    public VariablePowerSet() {
        this.set = new ArrayList<>();
    }

    public VariablePowerSet(ArrayList<Character> set) {
        this.set = new ArrayList<>(set);
    }

    public void addElement(Character element) {
        if (!this.set.contains(element)) {
            this.set.add(element);
        }
    }

    public void removeElement(Character element) {
        this.set.remove(element);
    }

    public boolean isElementBelong(Character element) {
        return this.set.contains(element);
    }

    public VariablePowerSet intersection(VariablePowerSet anotherSet) {
        VariablePowerSet intersectionSet = new VariablePowerSet();
        for (Character element : this.set) {
            if (anotherSet.isElementBelong(element)) {
                intersectionSet.addElement(element);
            }
        }
        return intersectionSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariablePowerSet that = (VariablePowerSet) o;
        return Objects.equals(set, that.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }

    @Override
    public String toString() {
        return "VariablePowerSet{" +
                "set=" + set +
                '}';
    }
}
