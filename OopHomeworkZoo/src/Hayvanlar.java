import javax.swing.AbstractAction;

public abstract class Hayvanlar {
    private String className;
    private int age;
    private int agirlik;

    public abstract void getFeedSchedule();
    public abstract void getDosage();
    
    public int getAge() {
        return age;
    }
    public int getAgirlik() {
        return agirlik;
    }
    public String getClassName() {
        return className;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}
