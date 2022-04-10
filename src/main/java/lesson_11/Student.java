package lesson_11;

import java.util.HashSet;
import java.util.Set;

public class Student {

    public String name;
    private Set<Subject> subjects;
    private DaysOfWeek[] learningDays;

    public Student(String name, Set<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
        this.learningDays = new DaysOfWeek[7];
    }

    public void whenDoILearn(){
        String days=new String();
        for(DaysOfWeek day:learningDays)
        {
            if (day==null)
                continue;
            days+=day+" ";
        }
        System.out.println("Привет, меня зовут " + name + ", я учусь по " + days);
    }

    public void addLearningDay(DaysOfWeek day){

        for (int i = 0; i < learningDays.length; i++) {
            if (learningDays[i] == null) {
                learningDays[i] = day;
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


