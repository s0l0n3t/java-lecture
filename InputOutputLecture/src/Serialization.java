import com.sun.source.tree.UsesTree;

import java.io.*;
import java.io.OutputStream;

public class Serialization {
    public static void main(String[] args) {
        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("LectureTest/araba.txt",true));
            outputStream.writeObject(new Car("BMW","320"));
            outputStream.close();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("LectureTest/araba.txt"));
            Car newCar = (Car) inputStream.readObject();
            System.out.println("Company : "+newCar.getName()+" Name : "+newCar.getName());
        }catch (Exception exception){
            System.out.println(exception.toString());
        }

    }
}
class Car implements Serializable {
    private String brand;
    private String name;

    public Car(String brand,String name){
        this.name =name;
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
