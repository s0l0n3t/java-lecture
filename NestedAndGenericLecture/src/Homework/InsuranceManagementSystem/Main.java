package Homework.InsuranceManagementSystem;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String email;
        String password;
        Scanner varSc = new Scanner(System.in);
        AccountManager accountClass = new AccountManager(new User("Furkan","Tokgoz","domain@gmail.com","123","Software Developer",25));

        while (true){
            System.out.println("""
                    \n\n
                    1 - Show User
                    2 - login
                    3 - buy insurance
                    4 - exit
                    """);
            switch (varSc.nextInt()){
                case 1:
                    accountClass.showUserInfo();
                    break;
                case 2:
                    System.out.println("email >");
                    email = varSc.next();
                    System.out.println("password >");
                    password = varSc.next();
                    System.out.println(accountClass.login(email,password));
                    break;
                case 3:
                    System.out.println("""
                            \n\n
                            1 - HealthInsurance
                            2 - ResidenceInsurance
                            3 - TravelInsurance
                            4 - CarInsurance
                            """);
                    switch (varSc.nextInt()){
                        case 1:
                            accountClass.insuranceArrayList.add(new HealthInsurance("Furkan",500,new Date(2024,9,19)));
                            break;
                        case 2:
                            accountClass.insuranceArrayList.add(new ResidenceInsurance("Furkan",500,new Date(2024,9,19)));
                            break;
                        case 3:
                            accountClass.insuranceArrayList.add(new TravelInsurance("Furkan",500,new Date(2024,9,19)));
                            break;
                        case 4:
                            accountClass.insuranceArrayList.add(new CarInsurance("Furkan",500,new Date(2024,9,19)));
                            break;
                    }
                    for(int i = 0;i<accountClass.insuranceArrayList.size();i++){
                        System.out.println("Name :"+accountClass.insuranceArrayList.get(i).getName()+ "\nPrice : " + accountClass.insuranceArrayList.get(i).calculate());
                    }
                    break;

                case 4:
                    break;
            }
        }
    }
}
