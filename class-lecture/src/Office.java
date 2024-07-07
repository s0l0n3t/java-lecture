public class Office {
    String OfficeName = "";
    Boolean isEmpty = true;
    int officeNumber;



    Office(String name,int officeNumber){
        this.OfficeName = name;
        this.officeNumber = officeNumber;
        this.isEmpty = false;
    }

    void isEmptyOffice(Boolean stdIn){
        this.isEmpty = stdIn;
    }
}

