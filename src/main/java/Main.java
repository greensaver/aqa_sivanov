import lesson_8.Cat;
import lesson_8.Lion;

public class Main {

    public static void main(String[] args) {
        //lesson_4.Run();
        //lesson_5.Run();
        //lesson_6.Run();
        //lesson_7.Run();
        Cat cat1 = new Cat("Весна", 50, 5);
        Cat cat2 = new Cat("Евжорий", 100, 10);

        Lion lion1 = new Lion("Simba", 300, 90);

        System.out.println(cat1.toString());
        System.out.println(cat1.equals(cat2));

        lion1.roar();
        lion1.chill();

    }

}