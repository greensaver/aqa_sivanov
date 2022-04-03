package lesson_8;

public final class Lion extends WildCat implements Jumpable{

    public Lion(String name, Integer lengthCm, Integer weight) {
        super(name, lengthCm, weight);
    }

    @Override
    public void roar() {
        System.out.println("ры-ры-ры!");
    }

    public void chill(){
        System.out.println("Зато у меня красивая грива");
    }

    @Override
    public int jump() {
        return 3;
    }

    @Override
    public String getName() {
        return name;
    }
}

