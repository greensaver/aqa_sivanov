import lesson_8.*;

public class Main {

    public static void main(String[] args) {
        //lesson_4.Run();
        //lesson_5.Run();
        //lesson_6.Run();
        //lesson_7.Run();
        /*DomesticCat cat1 = new DomesticCat("Весна", 50, 5);
        DomesticCat cat2 = new DomesticCat("Евжорий", 100, 10);
        Lion lion1 = new Lion("Simba", 300, 90);

        System.out.println(cat1.toString());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat2.toString());
        cat2.rename("Жорий");
        System.out.println(cat2.toString());
        lion1.roar();
        lion1.chill();*/

        DomesticCat cat1 = new DomesticCat("Весна", 50, 5);
        Lion lion1 = new Lion("Simba", 300, 90);
        Elephant elephant1 = new Elephant("Gimbo");

        Jumpable[] participants = {cat1, lion1, elephant1};

        JumpContest contest = new JumpContest(participants);
        contest.start();
        contest.getWinner();
    }
}