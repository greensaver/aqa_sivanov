package lesson_8;

public final class Lion extends WildCat {

    public Lion(String name, Integer lengthCm, Integer weight) {
        super(name, lengthCm, weight);
    }

    public void chill(){
        System.out.println("Зато у меня красивая грива");
    }
}

