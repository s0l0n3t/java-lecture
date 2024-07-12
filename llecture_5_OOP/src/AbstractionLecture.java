
public abstract class AbstractionLecture {

    protected int number;
    protected String name;

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public abstract int returNumber();
        
    }//Abstraction metod bu şekilde tanımlandı. Miras olarak bırakılan sınıfta istenildiği zaman ezilerek yerine kullanılabilmektedir.

