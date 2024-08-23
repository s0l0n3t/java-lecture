package inheritance;

public class main {
    public static void main(String[] args) {
        //Employer Class
        Employer max  = new Employer("Max Hellsover","max@gmail.com",454);
        System.out.println(max.enter());
        System.out.println(max.foodHouse());
        System.out.println(max.leave());
        //Academician Class
        Academician tom = new Academician("Tom","tom@gmail.com",512,"EEE","Prof");
        System.out.println(tom.enter());
        System.out.println(tom.enterToLecture());
        //Don Class
        Don sam = new Don("Sam","sam@gmail.com",513,"EEE","Associate Prof",12);
        System.out.println(sam.enter());
        System.out.println(sam.getDoorNumber());
        System.out.println(sam.makeExam());
        System.out.println(sam.meeting());
        //Assistant Class
        Asistant mary = new Asistant("Mary","mary@gmail.com",514,"EEE","Assistant","09.00");
        System.out.println(mary.enter());
        System.out.println(mary.getOfficeStartHours());
        System.out.println(mary.makeQuiz());

        //Officer Class
        Officer teddy = new Officer("Teddy", "teddy@gmail.com",515,"EEE", Officer.workingTime.EARLY);
        System.out.println(teddy.getDepartment());
        System.out.println(teddy.enter());
        System.out.println(teddy.work());
        //InformationProcess Class
        InformationProcess caitlyn = new InformationProcess("Caitlyn", "caitlyn@gmail.com",340,"IT", Officer.workingTime.LATE);
        System.out.println(caitlyn.enter());
        System.out.println(caitlyn.setNetwork());
        System.out.println(caitlyn.getWorkingTime());
        //SecurityPersonal Class
        SecurityPersonal karen = new SecurityPersonal("Karen","karen@gmail.com",345,"Sec", Officer.workingTime.LATE);
        System.out.println(karen.enter());
        System.out.println(karen.watch());
        System.out.println(karen.getWorkingTime());

        //Polymorphism
        Employer kane = new Academician("Ahmet","ahmet@gmail.com",512,"EEE","Dr");
        System.out.println(kane.enter());
        System.out.println(kane.leave());
        //We can hold on same list when we try main class.
        Employer[] mainList = {kane,caitlyn,karen,max,tom};
        System.out.println(mainList.length);

    }
}
