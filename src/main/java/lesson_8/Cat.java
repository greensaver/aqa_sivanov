package lesson_8;

import java.util.Objects;

public class Cat {

    public String name;
    public Integer lengthCm;
    public Integer weight;

    public Cat(String name) {

    }

    public Cat(String name, Integer lengthCm, Integer weight) {
           this.name = name;
           this.lengthCm = lengthCm;
           this.weight = weight;
    }

    @Override
    public String toString() {
        return "привет, я " + name + " моя длина " + lengthCm + " мой вес " + weight + ", вот и живи с этим";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return  (name == cat.name) && (lengthCm == cat.lengthCm) && (weight == cat.weight);
    }

    public void eat(){
        System.out.println("чвяк-чвяк");
    }

    public void voice(){
        System.out.println("мяу-мяу");
    }

    public void poo(){
        System.out.println("постирай тапки");
    }

    public void puke(){
        System.out.println("получи комочек шерсти");
    }

    public void sleep(){
        System.out.println("zzz-zzz");
    }


}

