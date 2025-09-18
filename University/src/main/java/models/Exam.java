package models;

import java.util.Objects;

public class Exam {
    Course course;
    String date;
    int maxPoints;

    @Override
    public String toString() {
        return "Exam{" +
                "course=" + course +
                ", date='" + date + '\'' +
                ", maxPoints=" + maxPoints +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return maxPoints == exam.maxPoints && Objects.equals(course, exam.course) && Objects.equals(date, exam.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, date, maxPoints);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Exam(Course course, String date, int maxPoints) {
        this.course = course;
        this.date = date;
        this.maxPoints = maxPoints;
    }
}
