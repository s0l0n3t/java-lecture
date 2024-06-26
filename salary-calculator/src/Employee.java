
public class Employee {
    String empName;
    int empSalary=0;
    int workHours;
    int hireYear=0;



    Employee(String empName, int empSalary, int workHours, int hireYear){
        this.empName = empName;
        this.empSalary =  empSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int taxCalculate(int KDV){
        //%3 KDV
        if(this.empSalary <= 1000){
            return 0;
        }
        else{
            
            return empSalary*(KDV/100);
        }
    }
    int bonus(){
        int bonusSalary=0;
        if(this.workHours >= 40){
            bonusSalary = 30*workHours;
        }
        return bonusSalary;
    }
    int raiseSalary(){
        int nowYear = 2021 - this.hireYear;
        if(nowYear < 10){
            return this.empSalary*(5/100);
            
        }
        else if(nowYear > 9 && nowYear < 20){
            return this.empSalary*(10/100);
            
        }
        else if(nowYear > 19){
            return this.empSalary*(15/100);
            
        }
        else{
            return 0;
        }
    }

    void toStringInfo(){
        int newSalary=this.empSalary+ taxCalculate(3) + bonus();
        int totalSalary = newSalary + raiseSalary();
        System.out.println("Name: "+this.empName);
        System.out.println("Salary: "+this.empSalary);
        System.out.println("Working(Hours): "+this.workHours);
        System.out.println("Year: "+this.hireYear);
        System.out.println("KDV: "+taxCalculate(3));
        System.out.println("Bonus: " + bonus());
        System.out.println("Increased: " + raiseSalary());
        System.out.println("KDV + Bonus: " + newSalary);
        System.out.println("Total Salary: " + totalSalary);
        

        
    }

}
