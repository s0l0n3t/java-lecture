public class finalLecture {
    public int varRadius;
    public static final double PI = 3.14;//Camel case used.
    public finalLecture(int radius){
        this.varRadius = radius;
    }

    public double calcArea(){
        return this.varRadius * this.varRadius * PI;
    }

}
