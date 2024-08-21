package inheritance;
//First inheritanced class
public class Employer {
    private String nameFirst;
    private int phone;
    private String email;

    public Employer(String nameFirst,String email,int phone){
        this.phone = phone;
        this.nameFirst = nameFirst;
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String enter(){
        return this.nameFirst + " entered to University";
    }
    public String leave(){
        return this.nameFirst + " left from University";
    }
    public String foodHouse(){
        return this.nameFirst + " entered to food house";
    }
}
