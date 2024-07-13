public class ApartmentElevater {
    private int elevaterFloor = 0;
    private final int capElevator = 6;
    
    public ApartmentElevater(){
        this.elevaterFloor = (int)Math.ceil(Math.random()*12);
    }
    public int getElevaterFloor() {
        return elevaterFloor;
    }
    public void setElevaterFloor(int elevaterFloor) {
        this.elevaterFloor = elevaterFloor;
    }
    
    public int getCapElevator() {
        return capElevator;
    }
}
