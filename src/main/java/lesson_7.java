import java.util.Scanner;
import java.util.regex.Pattern;

public class lesson_7 {

    private static Scanner _scanner;

    public static void Run() {

        _scanner = new Scanner(System.in);

        System.out.println("Привет. Введи номер задачи");
        if (!_scanner.hasNextInt())
        {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        }
        int s = _scanner.nextInt();
        switch (s) {
            case 1:
                Excercise1();
                break;
            case 2:
                Excercise2();
                break;
            case 3:
                Excercise3();
                break;
            default:
                System.out.println("Это не номер задачи!");
        }
    }

    public static void strCheck1() {
        System.out.println("Введите строку");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        int last = sc.length()-1;
        char ch = sc.charAt(last);
        System.out.println("Последний символ строки: " + ch);
    }

    public static void strCheck2() {
        System.out.println("Введите строку желательно заканчивающеюся на: !!! ");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        System.out.println(sc.endsWith("!!!"));

        if(sc.endsWith("!!!")){
            System.out.println("Строка заканчивается на !!!");
        }else{
            System.out.println("Строка НЕ заканчивается на !!!");
        }
    }

    public static void strCheck3() {
        System.out.println("Введите строку желательно начинающуюся на: I like");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        System.out.println(sc.startsWith("I like"));

        if(sc.startsWith("I like")){
            System.out.println("Строка начинается на: I like");
        }else{
            System.out.println("Строка НЕ начинается на: I like");
        }
    }

    public static void strCheck4() {
        System.out.println("Введите строку желательно с подстрокой: Java");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        System.out.println(sc.contains("Java"));

        if(sc.contains("Java")){
            System.out.println("Строка содержит подстроку: Java");
        }else{
            System.out.println("Строка НЕ содержит подстроку: Java");
        }
    }

    public static void strCheck5() {
        System.out.println("Введите строку, желательно: I like Java!!!");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        int index = sc.lastIndexOf("Java");

        System.out.println(sc.contains("Java"));

        if(index == -1){
            System.out.println("Подстрока \"Java\" не найдена");
        }else{
            System.out.println("Подстрока \"Java\" найдена в " + index);
        }
    }

    public static void strCheck6() {
        System.out.println("Введите строку, с символами: а");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        System.out.println(sc.replace('a', 'o'));
    }

    public static void strCheck7() {
        System.out.println("Введите строку");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        System.out.println(sc.toUpperCase());
    }

    public static void strCheck8() {
        System.out.println("Введите строку");

        if(!_scanner.hasNextLine()){
            System.out.println("Спасибо! Вы ввели пустую строку");
            return;
        }

        String sc = _scanner.nextLine();

        System.out.println(sc.toLowerCase());
    }

    public static void strCheck9() {
        System.out.println("Введите строку I like Java!!!");
    }

}