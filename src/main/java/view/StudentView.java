package view;

import data.Student;
import data.StudyGroup;
import data.User;
import service.StudyGroupService;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroups) {
            log.info(group.toString());
        }
    }

    public void showStudents(List<Student> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student group : studyGroups) {
            log.info(group.toString());
        }
    }
}
