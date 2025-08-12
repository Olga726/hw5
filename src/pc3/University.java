package pc3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID1, String studentName1){
        this.studentID=studentID1;
        this.studentName=studentName1;
    }

    static void changeUniversityName(String newName){
        universityName=newName;
    }

    String getStudentName(){
        return studentName;
    }

    void printStudentInfo(){
        System.out.println(studentName + " " + studentID + " " + universityName);
    }
}
