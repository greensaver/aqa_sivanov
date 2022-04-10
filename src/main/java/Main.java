import lesson_11.*;
import lesson_13.CredentialsChecker;
import lesson_8.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //lesson_4.Run();
        //lesson_5.Run();
        //lesson_6.Run();
        //lesson_7.Run();
        /*DomesticCat cat1 = new DomesticCat("Весна", 50, 5);
        DomesticCat cat2 = new DomesticCat("Евжорий", 100, 10);
        Lion lion1 = new Lion("Simba", 300, 90);
        System.out.println(cat1.toString());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat2.toString());
        cat2.rename("Жорий");
        System.out.println(cat2.toString());
        lion1.roar();
        lion1.chill();
        DomesticCat cat1 = new DomesticCat("Весна", 50, 5);
        Lion lion1 = new Lion("Simba", 300, 90);
        Elephant elephant1 = new Elephant("Gimbo");
        Jumpable[] participants = {cat1, lion1, elephant1};
        JumpContest contest = new JumpContest(participants);
        contest.start();
        contest.getWinner();*/

        /*Subject subject1 = new Subject(SubjectName.CHEMISTRY, 96);
        Subject subject2 = new Subject(SubjectName.MATH, 1);
        Subject subject3 = new Subject(SubjectName.HISTORY, 86);
        Subject subject4 = new Subject(SubjectName.LITERATURE, 15);
        Subject subject5 = new Subject(SubjectName.PHYSICS, 96);

        Student student1 = new Student("Бiба");
        Student student2 = new Student("Боба");

        student1.addLearningDay(DaysOfWeek.Monday);
        student1.addLearningDay(DaysOfWeek.Wednesday);
        student1.addSubject(subject1);
        student1.addSubject(subject2);
        student1.addSubject(subject3);
        student1.addSubject(subject4);
        student1.whenDoILearn();

        student2.addLearningDay(DaysOfWeek.Thursday);
        student2.addLearningDay(DaysOfWeek.Wednesday);
        student2.addSubject(subject1);
        student2.addSubject(subject2);
        student2.addSubject(subject3);
        student2.addSubject(subject5);
        student2.whenDoILearn();

        Teacher teacher = new Teacher("Петрович", "Доцент кафедри ДПЮ");
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        teacher.teach(SubjectName.CHEMISTRY);*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        System.out.println("Повторите пароль");
        String passwordConfirmation = scanner.next();

        boolean result = CredentialsChecker.Check(login,password,passwordConfirmation);

        if (!result)
            System.out.println("Что-то пошло не так");






    }
}