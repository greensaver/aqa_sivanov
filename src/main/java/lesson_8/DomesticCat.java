package lesson_8;

public class DomesticCat extends Cat {
    public DomesticCat(String name, Integer lengthCm, Integer weight) {
        super(name, lengthCm, weight);
    }

    public void purr(){
        System.out.println("мурмур..");
    }
    public void rename(String name){
        setName(name);
    }
}
