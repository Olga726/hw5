package pc3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int newEmployeeID, String newEmployeeName){
        this.employeeName=newEmployeeName;
        this.employeeID=newEmployeeID;
    }

    static void printCompanyName(){
        System.out.println(companyName);
    }

    String getEmployeeName(){
        return employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        employeeName=newEmployeeName;
    }

    void setCompanyName(String newCompanyName){
        companyName=newCompanyName;
    }

}
