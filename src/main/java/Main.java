
import controller.Controller;
import data.Student;
import data.StudyGroup;
import data.Teacher;
import data.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Petr", "Ivanov", "Anton");
        controller.createUser("Ilon", "Mask", "Joe");
        controller.createUser("Joe", "Doe", "Djek");
        controller.createUser("Andrei", "Doe", "Djek");
        //        controller.showAllStudents();
//        List <StudyGroup> studyGroups  = controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L),
//                controller.getOnlyStudents());
//        controller.showStudyGroups(studyGroups);
        controller.showSortStudyGroup(controller.getOnlyStudents());


    }
}
