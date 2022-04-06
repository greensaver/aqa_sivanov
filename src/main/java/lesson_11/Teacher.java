package lesson_11;

import java.util.ArrayList;

public class Teacher {

    private final String name;
    private final String jobTitle;
    private ArrayList<Student> students;

    public Teacher(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        if (student == null)
            return;
        students.add(student);
    }

    public void teach(SubjectName subjectName){
        System.out.println("урок " + subjectName + " начался");
        for (Student student:students){

            if (student.isAbleToLearn(subjectName)) {
                student.learn(subjectName);
            }

        }
        System.out.println("урок " + subjectName + " закончился");
    }

}
