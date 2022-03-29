package lesson_8;

public class WildCat extends Cat {

    public WildCat(String name, Integer lengthCm, Integer weight) {
        super(name, lengthCm, weight);
    }

    public void roar(){
        System.out.println("ры-ры-ры!");
    }
}
