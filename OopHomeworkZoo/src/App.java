public class App {
    public static void main(String[] args) throws Exception {
        Atlar atClass = new Atlar(2, 200);
        atClass.getDosage();
        atClass.getFeedSchedule();
        System.out.println();
        Kedigiller kediClass = new Kedigiller(5, 50);
        kediClass.getDosage();
        kediClass.getFeedSchedule();
        System.out.println();
        Kemirgenler kemirgenClass = new Kemirgenler(1, 1);
        kemirgenClass.getDosage();
        kemirgenClass.getFeedSchedule();
    }
}
