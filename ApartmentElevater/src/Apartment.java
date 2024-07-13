public class Apartment{

    private int apartFloor = 0;
    private boolean doorElevator = false;
    private boolean doorBell = false;
    private int elevator1Floor = 0;
    private int elevator2Floor = 0;
    private int elevator3Floor = 0;
    private int elevator4Floor = 0;
    private int elevator5Floor = 0;


    public Apartment(int apartFloor){
        this.apartFloor = apartFloor;
        ApartmentElevater apartmentElevater1 = new ApartmentElevater();
        ApartmentElevater apartmentElevater2 = new ApartmentElevater();
        ApartmentElevater apartmentElevater3 = new ApartmentElevater();
        ApartmentElevater apartmentElevater4 = new ApartmentElevater();
        ApartmentElevater apartmentElevater5 = new ApartmentElevater();
        
        elevator1Floor = apartmentElevater1.getElevaterFloor();
        elevator2Floor = apartmentElevater2.getElevaterFloor();
        elevator3Floor = apartmentElevater3.getElevaterFloor();
        elevator4Floor = apartmentElevater4.getElevaterFloor();
        elevator5Floor = apartmentElevater5.getElevaterFloor();
    }


    public void callElevater1(){//gövdeli metod
        if(elevator1Floor > apartFloor){
            for(int i = elevator1Floor; i<= apartFloor;i++){
                System.out.println("Asansör "+ i + "katındadır.");
            }
            this.elevator1Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
            
        }
        else if(elevator1Floor < apartFloor){
            for(int j = elevator1Floor; elevator1Floor >= apartFloor; j++){
                System.out.println("Asansör "+ j + "katındadır.");
            }
            this.elevator1Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else{
            System.out.println("Asansor zaten burada !");
        }
    }
    public void callElevater2(){//gövdeli metod
        if(elevator2Floor > apartFloor){
            for(int i = elevator2Floor; i<= apartFloor;i++){
                System.out.println("Asansör "+ i + "katındadır.");
            }
            this.elevator2Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else if(elevator2Floor < apartFloor){
            for(int j = elevator2Floor; elevator2Floor >= apartFloor; j++){
                System.out.println("Asansör "+ j + "katındadır.");
            }
            this.elevator2Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else{
            System.out.println("Asansor zaten burada !");
        }
    }
    public void callElevater3(){//gövdeli metod
        if(elevator3Floor > apartFloor){
            for(int i = elevator3Floor; i<= apartFloor;i++){
                System.out.println("Asansör "+ i + "katındadır.");
            }
            this.elevator3Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else if(elevator3Floor < apartFloor){
            for(int j = elevator3Floor; elevator3Floor >= apartFloor; j++){
                System.out.println("Asansör "+ j + "katındadır.");
            }
            this.elevator3Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else{
            System.out.println("Asansor zaten burada !");
        }
    }
    public void callElevater4(){//gövdeli metod
        if(elevator4Floor > apartFloor){
            for(int i = elevator4Floor; i<= apartFloor;i++){
                System.out.println("Asansör "+ i + "katındadır.");
            }
            this.elevator4Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else if(elevator4Floor < apartFloor){
            for(int j = elevator4Floor; elevator4Floor >= apartFloor; j++){
                System.out.println("Asansör "+ j + "katındadır.");
            }
            this.elevator4Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else{
            System.out.println("Asansor zaten burada !");
        }
    }
    public void callElevater5(){//gövdeli metod
        if(elevator5Floor > apartFloor){
            for(int i = elevator5Floor; i<= apartFloor;i++){
                System.out.println("Asansör "+ i + "katındadır.");
            }
            this.elevator5Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else if(elevator5Floor < apartFloor){
            for(int j = elevator5Floor; elevator5Floor >= apartFloor; j++){
                System.out.println("Asansör "+ j + "katındadır.");
            }
            this.elevator5Floor = apartFloor;
            System.out.println("Kapı zili çaldı !");
        }
        else{
            System.out.println("Asansor zaten burada !");
        }
    }



    //getter and setters
    public int getApartFloor() {
        return apartFloor;
    }
    public void setApartFloor(int apartFloor) {
        this.apartFloor = apartFloor;
    }
    public boolean isDoorElevator() {
        return doorElevator;
    }
    
    public boolean isDoorBell() {
        return doorBell;
    }
    public int getElevator1Floor() {
        return elevator1Floor;
    }
    public int getElevator2Floor() {
        return elevator2Floor;
    }
    public int getElevator3Floor() {
        return elevator3Floor;
    }
    public int getElevator4Floor() {
        return elevator4Floor;
    }
    public int getElevator5Floor() {
        return elevator5Floor;
    }
    public void setElevator1Floor(int elevator1Floor) {
        this.elevator1Floor = elevator1Floor;
    }
    public void setElevator2Floor(int elevator2Floor) {
        this.elevator2Floor = elevator2Floor;
    }
    public void setElevator3Floor(int elevator3Floor) {
        this.elevator3Floor = elevator3Floor;
    }
    public void setElevator4Floor(int elevator4Floor) {
        this.elevator4Floor = elevator4Floor;
    }
    public void setElevator5Floor(int elevator5Floor) {
        this.elevator5Floor = elevator5Floor;
    }
    
    
    
}
