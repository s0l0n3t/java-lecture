public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int x,int y){
        this.x = x;
        this.y = y;

    }

    public int calculateDistanceFromOrigin(){
    // a^2 = x^2 + y^2
        return (this.x*this.x) + (this.y * this.y);
    }
    public double calculateDistanceFromOtherPoint(int otherX,int otherY){
        return Math.pow(Math.pow( (this.x - otherX),2)+Math.pow((this.y - otherY),2),1/2);
    }

    public Point clone(int x,int y){
        return new Point(x,y);
    }
    public boolean move(int x,int y){
        this.x+= x;
        this.y+= y;
        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
