package pc2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String newGroupName, int newStudentCount){
        this.groupName = newGroupName;
        this.studentCount = newStudentCount;
    }

    String getGroupName(){
        return groupName;
    }

    int getStudentCount(){
        return studentCount;
    }

    void setGroupName(String newGroupName){
        groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount){
        studentCount = newStudentCount;
    }

    public void printInfo(){
        System.out.println("Группа: " + this.groupName + ", Количество студентов: " + this.studentCount);
    }
}
