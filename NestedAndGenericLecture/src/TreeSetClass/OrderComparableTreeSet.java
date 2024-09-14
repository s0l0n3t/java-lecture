package TreeSetClass;

public class OrderComparableTreeSet implements Comparable<TreeSetTestClass>{
    @Override
    public int compareTo(TreeSetTestClass o) {
        return o.getId();
    }
}
