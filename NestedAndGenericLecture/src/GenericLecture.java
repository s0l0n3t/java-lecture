public class GenericLecture {

    public static void main(String[] args) {

        String s;
        int x = 10;
        boolean y = false;

        String a = ""; // bu değişken boştur.
        String b = null; // değişken değeri yok anlamına gelir.
        Nullable isNull = new Nullable(b);
        isNull.run();

        GenericNullable<Integer> isGenericNull = new GenericNullable<>(x);
        isGenericNull.run();

        GenericMultiple<String,Integer,Boolean> genericMultiple = new GenericMultiple<>(a,x,y);
        System.out.println(genericMultiple.toString());


        String[] arrayTest = {"java","102","patika"};
        Integer[] arrayTest1 = {1,2,3};
        genericMultiple.printArray(arrayTest1);
    }
}
