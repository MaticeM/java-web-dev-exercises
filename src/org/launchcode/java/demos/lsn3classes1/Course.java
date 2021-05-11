package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    private int courseNumber;
    private HashMap<String, String> subjectAndTitle;
    private String semester;

    public Course(int courseNumber, HashMap subjectAndTitle, String semester) {
        this.courseNumber = courseNumber;
        this.subjectAndTitle = subjectAndTitle;
        this.semester = semester;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public HashMap getSubjectAndTitle() {
        return subjectAndTitle;
    }

    public String getSemester() {
        return semester;
    }

    public void setCourseNumber(int aCourseNumber) {
        courseNumber = aCourseNumber;
    }

    public void setSubjectAndTitle(HashMap aSubjectAndTitle) {
        subjectAndTitle = aSubjectAndTitle;
    }

    public void setSemester(String aSemester) {
        semester = aSemester;
    }
}
