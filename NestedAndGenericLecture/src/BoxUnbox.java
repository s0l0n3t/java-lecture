public class BoxUnbox {
    int a = 10;
    //autoboxing
    Integer b =a ;

    //boxing
    Integer c = Integer.valueOf(a);

    //Auto unboxing
    int d = c;

    //unboxing
    int i = c.intValue();
}
