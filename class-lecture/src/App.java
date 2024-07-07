public class App {
    public static void main(String[] args) throws Exception {
        University kocaeliFurkan = new University("Furkan", 0);
        Departments kocaeliDep = new Departments("Bilgi");
        kocaeliFurkan.addDepartmen(kocaeliDep);
        Office kocaeliOffice = new Office("Bilgi1", 100);
        kocaeliDep.takeOffice(kocaeliOffice);
        System.out.println(kocaeliOffice.OfficeName);
        


        University kocaeliAhmet = new University("Ahmet", 1);
        kocaeliAhmet.addDepartmen(kocaeliDep);
        System.out.println(kocaeliAhmet.departments.departmenName);
    }
}
