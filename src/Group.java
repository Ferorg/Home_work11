
import java.util.*;

public class Group {
    private String groupNumber;
    private static List<Student> studentsList = new ArrayList<>();


    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }


    public static List<Student> getStudentsList() {
        return studentsList;
    }

    public static void setStudentsList(List<Student> studentsList1) {
        Group.studentsList = studentsList1;
    }


    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return "Group{" +
                "\ngroupNumber='" + groupNumber + '\'' +
                ", groupList=\n" + studentsList +
                '}';
    }

    public static void deductionStudent(Group group) {
        for (int i = 0; i < group.getStudentsList().size(); i++) {
            if (group.getStudentsList().get(i).getAverageMark() < 4) {
                group.getStudentsList().remove(group.getStudentsList().get(i));
            }
        }
    }

    public static double groupAverageCalculation(Group group) {
        int totalScore = 0;
        int overallGPA = 0;
        for (int i = 0; i < group.getStudentsList().size(); i++) {
            totalScore += group.getStudentsList().get(i).getAverageMark();
        }
        overallGPA = totalScore / group.getStudentsList().size();

        return overallGPA;
    }

    public static void groupSort2(Group group) {
        for (int i = 0; i < group.getStudentsList().size(); i++) {
            for (int j = 0; j < group.getStudentsList().size() - 1; j++) {
                if (group.getStudentsList().get(j).getAverageMark() < group.getStudentsList().get(j + 1).getAverageMark()) {
                    Student temp = group.getStudentsList().get(j + 1);
                    group.getStudentsList().set(j + 1, group.getStudentsList().get(j));
                    group.getStudentsList().set(j, temp);

                }
            }

        }
    }

    public static void groupSort(Group group) {

        for (int i = 0; i < group.getStudentsList().size(); i++) {
            for (int j = 0; j < group.getStudentsList().size() - 1; j++) {
                if (group.getStudentsList().get(j).getAverageMark() > group.getStudentsList().get(j + 1).getAverageMark()) {
                    Student temp = group.getStudentsList().get(j + 1);
                    group.getStudentsList().set(j + 1, group.getStudentsList().get(j));
                    group.getStudentsList().set(j, temp);

                }
            }

        }


    }
}








