package lesson_11;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String name;
    private ArrayList<Subject> subjects;
    private ArrayList<DaysOfWeek> learningDays;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<Subject>();
        this.learningDays = new ArrayList<DaysOfWeek>();
    }

    public void whenDoILearn(){
        System.out.println("Привет, меня зовут " + name + ", я учусь по " + learningDays);
    }

    public void addLearningDay(DaysOfWeek day){
        if (learningDays.contains(day))
            return;
        learningDays.add(day);
    }

    public void addSubject(Subject subject){
        if (subject == null)
            return;
        subjects.add(subject);
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


