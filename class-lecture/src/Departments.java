public class Departments {
    String departmenName = "";
    Office office;


    Departments(String departmenName){
        this.departmenName = departmenName;
        
    }
    void takeOffice(Office office){
        if(office.isEmpty == true){
            this.office = office;
        }
        else{
            System.out.println("Dolu !");
        }
    }

}
