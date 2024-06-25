class Car {

    //Nesne oluşturuldu.
    String name = "Toyota";
    String type;
    String color;
    int model;
    int price;

    Car(String name,int model, int price){
        //Constructor
        this.model = model;
        this.price = price; //Sınıftaki değişkenin dışarıdan alınanla eşitlendi.
        System.out.println(name + " Nesne çağırıldı. " + model + " "+ this.name);


    }

    void increasePrice(int incNumber){
        //Sınıfa ait değişkenler kullanılmıştır.
        if(this.model >= 2020){
           this.price += incNumber;
        }
        
    }

    void decreasePrice(int decNumber){
        if(this.model <= 2019){
            this.price -= decNumber;
        }
    }
}
