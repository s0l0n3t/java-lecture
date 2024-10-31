public class Main {
    public static void main(String[] args) {
        //Homework 1
        for(int i = 0; i<5;i++){
            new CountClass("Furkan "+i,"TKGZ",i);
            //5 object instance
        }
        System.out.println(CountClass.count);


        //Homework 2
        for (int i = 0;i<CountClass.objectArrayList.size();i++)
            System.out.println(CountClass.objectArrayList.get(i).getNumber());


    }
}