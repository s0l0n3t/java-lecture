package InterfaceClass;

public class Abank implements IBank{
    private String bankName;
    private int terminalId;
    private String password;


    public Abank(String bankName,int terminalId,String password){
        this.bankName= bankName;
        this.terminalId = terminalId;
        this.password= password;
    }



    public String getPassword() {
        return password;
    }
    public String getBankName() {
        return bankName;
    }
    public int getTerminalId() {
        return terminalId;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public boolean isConnected(){
        System.out.println("App connected via "+this.bankName + " as "+ this.terminalId);
        return true;
    }
    @Override
    public String payment(String paymentPoint){
        return "Payment has been completed for "+ paymentPoint;
    }
    @Override
    public String leave(){
        return this.terminalId + " left from "+ this.bankName;
    }

}

