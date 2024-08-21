package inheritance;

public class InformationProcess extends Officer{
    private String mission;

    public InformationProcess(String nameFirst, String email,int phone,String deplartment,Officer.workingTime workingTime){
        super(nameFirst,email,phone,deplartment, workingTime);
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String setNetwork(){
        return this.getNameFirst()+ "setting up the network";
    }
}
