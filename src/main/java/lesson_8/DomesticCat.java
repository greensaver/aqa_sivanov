package lesson_8;

public class DomesticCat extends Cat implements Jumpable {
    public DomesticCat(String name, Integer lengthCm, Integer weight) {
        super(name, lengthCm, weight);
    }

    public void purr(){
        System.out.println("мурмур..");
    }
    public void rename(String name){
        this.name=name;
    }

    @Override
    public int jump() {
        return 1;
    }

    @Override
    public String getName() {
        return name;
    }
}
