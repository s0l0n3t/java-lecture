public class UsingAbstraction extends AbstractionLecture{



    public UsingAbstraction(int number){
        super.setNumber(number);
    }

    @Override
    public int returNumber(){
        this.number *= 2;
        return this.number;
    }//abstract metod ezilerek istenildiği gibi şekil verilmiştir.
}
