package abstractClass;

public abstract class abstractClass {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int id;
    public abstractClass(String firstName,String lastName, int phoneNumber, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getId() {
        return id;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract String enter();
    public abstract String enter(String place);
    public abstract String leave();
    public abstract String leave(String place);
    public abstract String eatFood();
    public abstract String eatFood(String place);



}
