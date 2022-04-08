package lesson_11;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String name;
    private Subject[] subjects;
    private DaysOfWeek[] learningDays;

    public Student(String name) {
        this.name = name;
        this.subjects = new Subject[10];
        this.learningDays = new DaysOfWeek[7];
    }

    public void whenDoILearn(){
        System.out.println("Привет, меня зовут " + name + ", я учусь по " + learningDays);
    }

    public void addLearningDay(DaysOfWeek day){

        for (int i = 0; i < learningDays.length; i++) {
            if (learningDays[i] == null) {
                learningDays[i] = day;
                return;
            }
        }

    }

    public void addSubject(Subject subject){
        if (subject == null)
            return;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                return;
            }
        }
    }

    public boolean isAbleToLearn(SubjectName subjectName){
        return getSubject(subjectName)==null?false:true;
    }

    public void learn(SubjectName subjectName){

        Subject found = getSubject(subjectName);

        if (found != null)
            System.out.println(name + " выучил " + subjectName);
        else
            System.out.println(name + " потерялся и зашел не в тот класс");

    }

    private Subject getSubject(SubjectName subjectName) {
        Subject found = null;
        for (Subject subject:subjects){

            if (subject.Name== subjectName) {
                found = subject;
                break;
            }
        }
        return found;
    }
}


