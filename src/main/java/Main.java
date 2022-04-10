import lesson_11.*;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Subject subject1 = new Subject(SubjectName.CHEMISTRY, 96);
        Subject subject2 = new Subject(SubjectName.MATH, 1);
        Subject subject3 = new Subject(SubjectName.HISTORY, 86);
        Subject subject4 = new Subject(SubjectName.LITERATURE, 15);
        Subject subject5 = new Subject(SubjectName.PHYSICS, 96);

        Set<Subject> subjects1=new HashSet<>();
        subjects1.add(subject1);
        subjects1.add(subject2);
        subjects1.add(subject3);
        subjects1.add(subject4);
        Student student1 = new Student("Бiба", subjects1);

        student1.addLearningDay(DaysOfWeek.Monday);
        student1.addLearningDay(DaysOfWeek.Wednesday);
        student1.whenDoILearn();

        Set<Subject> subjects2=new HashSet<>();
        subjects2.add(subject1);
        subjects2.add(subject2);
        subjects2.add(subject3);
        subjects2.add(subject5);
        Student student2 = new Student("Боба", subjects2);

        student2.addLearningDay(DaysOfWeek.Thursday);
        student2.addLearningDay(DaysOfWeek.Wednesday);
        student2.whenDoILearn();

        Teacher teacher = new Teacher("Петрович", "Доцент кафедри ДПЮ");
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        teacher.teach(SubjectName.CHEMISTRY);
    }
}