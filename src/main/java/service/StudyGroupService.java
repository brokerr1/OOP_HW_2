package service;

import data.Student;
import data.StudyGroup;
import data.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupService {

    public List<StudyGroup> completeStudyGroup(Teacher teacher, List<Student> studentsList) {

        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(new StudyGroup(teacher, studentsList));
        return studyGroupList;

    };
}
