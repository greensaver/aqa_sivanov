package lesson_8;

public class Elephant implements Jumpable {

    String name;
    public Elephant(String name) {
        this.name=name;
    }

    @Override
    public int jump() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }
}
