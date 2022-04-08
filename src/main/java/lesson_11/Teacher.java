package lesson_11;

import java.util.ArrayList;

public class Teacher {

    private final String name;
    private final String jobTitle;
    private Student[] students;

    public Teacher(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.students = new Student[10];
    }

    public void addStudent(Student student){
        if (student == null)
            return;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }

    }

    public void teach(SubjectName subjectName){
        System.out.println("урок " + subjectName + " начался");
        for (Student student:students){

            if (student!=null&&student.isAbleToLearn(subjectName)) {
                student.learn(subjectName);
            }

        }
        System.out.println("урок " + subjectName + " закончился");
    }

}
