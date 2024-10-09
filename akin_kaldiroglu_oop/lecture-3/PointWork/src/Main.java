public class Main {
    public static void main(String[] args) {
        Point firstPointObject = new Point(12,5);
        System.out.println(firstPointObject.calculateDistanceFromOrigin());
        System.out.println(firstPointObject.move(2,3));
        System.out.println(firstPointObject.getX()+ " "+ firstPointObject.getY());
        System.out.println(firstPointObject.calculateDistanceFromOrigin());
        System.out.println(firstPointObject.calculateDistanceFromOtherPoint(5,7));
    }
}