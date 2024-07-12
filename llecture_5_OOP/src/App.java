
public class App {
    public static void main(String[] args) throws Exception {
        Car audi = new Car("Audi",2020,15000);
        /*audi.color = "White";
        audi.model = 2020;
        audi.name = "Audi";
        audi.type = "a4";
        audi.price = 15000;*/
        Car bmw = new Car("BMW",2015,25000);
        /*bmw.color = "Black";
        bmw.model = 2015;
        bmw.name = "BMW";
        bmw.type = "3.20";
        bmw.price = 25000;*/
        audi.increasePrice(1500);
        System.out.println(audi.price);


        //Inheritance
        extendedClassInheritance inheritance = new extendedClassInheritance();
        inheritance.setName("Furkan");
        inheritance.setSirname("TOKGOZ");
        System.out.println(inheritance.getName());
        System.out.println(inheritance.getSirname());
        inheritance.eatFood();

    }
    
}


