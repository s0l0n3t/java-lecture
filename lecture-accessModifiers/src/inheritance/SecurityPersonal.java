package inheritance;

public class SecurityPersonal extends Officer{
    private String document;
    public SecurityPersonal(String nameFirst,String email,int phone,String department,Officer.workingTime workingTime){
        super(nameFirst, email, phone, department, workingTime);
    }

    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }

    public String watch(){
        return this.getNameFirst()+ " is watching out";
    }
}
