package org.example;

import models.*;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "Vasya", "Bobrenko", "20.08.2025");
            System.out.printf("Student name: %s %s\n",
                    student.getFirstName(),
                    student.getLastName()
            );

            Professor professor = new Professor("Brian", "Moser", "Math");
            System.out.printf("Hello professor, %s %s\n",
                    professor.getFirstName(),
                    professor.getLastName()
            );

            Course course = new Course("CPP", 18, Seasons.AUTUMN);
//
            Enrollment enrollment = new Enrollment(student, course);
            System.out.printf("Student %s %s in course %s\n",
                    enrollment.getStudent().getFirstName(),
                    enrollment.getStudent().getLastName(),
                    enrollment.getCourse().getTitle()
            );
            Exam exam = new Exam(course, "18.09.2025", 100);

            System.out.printf("Exam %s in %s. Max points: %d\n",
                    exam.getCourse().getTitle(),
                    exam.getDate(),
                    exam.getMaxPoints());
        } catch (Exception e) {
            String RED = "\u001B[31m";
            String RESET = "\u001B[0m";
            System.out.println(RED + "Error" + RESET);
            System.out.println("Message: " + e.getMessage());
            return;
        }
    }
}