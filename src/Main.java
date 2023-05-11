import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student leon = new Student("Леон", "Фирсов", "11.09.1998", "Гомель", 5);
        Student diana = new Student("Диана", "Дружинина", "12.12.1997", "Речица", 7);
        Student makar = new Student("Макар", "Скворцов", "15.09.1996", "Слоним", 2);
        Student danila = new Student("Данила", "Киселев", "18.03.1999", "Минск", 4);
        Student kirill = new Student("Кирилл", "Журавлев", "12.01.1999", "Брест", 9);
        Student anastasia = new Student("Анастасия", "Редько", "22.02.1999", "Хойники", 10);


        Group group1 = new Group("D25");
        group1.addStudent(leon);
        group1.addStudent(diana);
        group1.addStudent(makar);


        Group group2 = new Group("D28");
        group2.addStudent(danila);
        group2.addStudent(kirill);
        group2.addStudent(anastasia);

        Faculty historical = new Faculty("Исторический");
        historical.addGroup(group1);
        historical.addGroup(group2);

        System.out.println(group1.toString());
        System.out.println("-----");
        Group.deductionStudent(group1);


        transferToAnotherGroup(group1, group2);
        System.out.println("_______");
        System.out.println(group1.toString());
        System.out.println("_______");
        System.out.println(group2.toString());
        facultyActive(historical);
        System.out.println(Faculty.getIsActive());

        changeFacultyState(historical);
        System.out.println(historical.getGroupList().size());
        System.out.println(Faculty.getIsActive());
        System.out.println(Group.groupAverageCalculation(group1));


        sortByAverageMark(group1);
        System.out.println(group1);
        sortByAverageMarkYbiv(group1);
        System.out.println(group1);
    }

    public static void changeFacultyState(Faculty faculty) {
        if (faculty.getGroupList().size() < 20) {
            facultyNotActive(faculty);
        } else {
            facultyActive(faculty);
        }

    }

    public static void facultyActive(Faculty faculty) {
        faculty.setIsActive(IsActive.Active);
    }

    public static void facultyNotActive(Faculty faculty) {
        faculty.setIsActive(IsActive.NotActive);
    }

    public static void transferToAnotherGroup(Group group1, Group group2) {
        if (group1.getGroupNumber().equals("D25")) {
            if (group1.getStudentsList().size() <= 2) {
                for (int i = 0; i < group1.getStudentsList().size(); i++) {
                    group2.addStudent(group1.getStudentsList().get(i));
                }
                group1.getStudentsList().clear();
            }
        } else if (group1.getGroupNumber().equals("D28")) {
            if (group1.getStudentsList().size() <= 2) {
                for (int i = 0; i < group1.getStudentsList().size(); i++) {
                    group2.addStudent(group1.getStudentsList().get(i));
                }
                group1.getStudentsList().clear();
            }
        }

    }

    public static void sortByAverageMark(Group group) {
        group.groupSort(group);
    }

    public static void sortByAverageMarkYbiv(Group group) {
        group.groupSort2(group);

    }
}


