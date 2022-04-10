package lesson_11;

import java.util.Objects;

public class Subject {
    public SubjectName Name;
    public int AmountOfHours;

    public Subject(SubjectName name, int amountOfHours) {
        Name = name;
        AmountOfHours = amountOfHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return AmountOfHours == subject.AmountOfHours && Name == subject.Name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, AmountOfHours);
    }
}
