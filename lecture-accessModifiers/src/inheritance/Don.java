package inheritance;

public class Don extends Academician{
    private int doorNumber;
    public Don(String nameFirst, String email, int phone,String department,String title,int doorNumber){
        super(nameFirst, email, phone, department, title);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }
    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String meeting(){
        return this.getTitle() +" "+ this.getNameFirst() + " went to meeting";
    }
    public String makeExam(){
        return this.getTitle()+" "+this.getNameFirst() + "started to "+ this.getDepartment() + " exam";
    }
}
