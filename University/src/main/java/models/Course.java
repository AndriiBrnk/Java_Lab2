package models;

import util.Utils;

import java.util.Objects;

public class Course {
    protected String title;
    protected int credits;
    protected Seasons semester;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                ", semester=" + semester +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return credits == course.credits && Objects.equals(title, course.title) && semester == course.semester;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, credits, semester);
    }

    public void setTitle(String title) throws Exception {
        if(!Utils.isEmptyStr(title))
        {
            throw new Exception("This field empty");
        }
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) throws Exception {
        if(Utils.isNegative(credits))
        {
            throw new Exception("Number is negative.");
        }
        this.credits = credits;
    }

    public Seasons getSemester() {
        return semester;
    }

    public void setSemester(Seasons semester) {
        this.semester = semester;
    }

    public Course(String title, int credits, Seasons semester) throws Exception {
        this.setTitle(title);
        this.setCredits(credits);
        this.setSemester(semester);
    }
}
