package Homework;

public class main {
    public static void main(String[] args) {
        GenericList<Integer> asd = new GenericList<Integer>(Integer[].class,20);
        System.out.println(asd.size());
        asd.add(12);
        asd.add(11);
        asd.add(15);
        asd.add(13,0);
        asd.add(9,2);
        System.out.println(asd.size());
        System.out.println(asd.toString());
        System.out.println(asd.get(2));
        asd.remove(1);
        asd.set(0,1);
        asd.add(9);
        System.out.println(asd.indexOf(9));
        System.out.println(asd.lastIndexOf(9));
        System.out.println(asd.isEmpty());
        System.out.println(asd.toString());
        Object[] dizi = asd.toArray();
        System.out.println(dizi[0]);
        asd.clear();
        System.out.println(asd.toString());
    }
}
