package TreeSetClass;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        OrderComparableTreeSet order = new OrderComparableTreeSet();
        TreeSet<TreeSetTestClass> testClassTreeSet = new TreeSet<>((Comparator) order);
        testClassTreeSet.add(new TreeSetTestClass(1,"Furkan"));
        testClassTreeSet.add(new TreeSetTestClass(2,"Ahmet"));


        for (TreeSetTestClass testClass: testClassTreeSet){
            System.out.println(testClass.getName());
        }
    }

}
