public class University {
    String employerName = "";
    int employerClass;
    Departments departments;

    University(String employerName,int employerClass){
        this.employerName = employerName;
        if(employerClass == 1){
            this.employerClass = employerClass;
        }
        else{
            this.employerClass = 0;
        }
    }
    void addDepartmen(Departments departments){
        this.departments = departments;
    }
}
