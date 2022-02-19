import java.util.Scanner;

public class lesson_7 {

    private static Scanner _scanner;

    public static void Run() {

        _scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Привет. Введи номер задачи");
        if (!_scanner.hasNextInt()) {
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

    private static void Excercise1() {
        strCheck1();
        strCheck2();
        strCheck3();
        strCheck4();
        strCheck5();
        strCheck6();
        strCheck7();
        strCheck8();
        strCheck9();
    }

    public static void strCheck1() {
        System.out.println("Введите строку");
        String sc = _scanner.next();

        int last = sc.length() - 1;
        char ch = sc.charAt(last);
        System.out.println("Последний символ строки: " + ch);
    }

    public static void strCheck2() {
        System.out.println("Введите строку желательно заканчивающеюся на: !!! ");

        String sc = _scanner.next();

        System.out.println(sc.endsWith("!!!"));

        if (sc.endsWith("!!!")) {
            System.out.println("Строка заканчивается на !!!");
        } else {
            System.out.println("Строка НЕ заканчивается на !!!");
        }
    }

    public static void strCheck3() {
        System.out.println("Введите строку желательно начинающуюся на: I like");


        String sc = _scanner.next();

        System.out.println(sc.startsWith("I like"));

        if (sc.startsWith("I like")) {
            System.out.println("Строка начинается на: I like");
        } else {
            System.out.println("Строка НЕ начинается на: I like");
        }
    }

    public static void strCheck4() {
        System.out.println("Введите строку желательно с подстрокой: Java");

        String sc = _scanner.nextLine();

        System.out.println(sc.contains("Java"));

        if (sc.contains("Java")) {
            System.out.println("Строка содержит подстроку: Java");
        } else {
            System.out.println("Строка НЕ содержит подстроку: Java");
        }
    }

    public static void strCheck5() {
        System.out.println("Введите строку, желательно: I like Java!!!");

        String sc = _scanner.next();

        int index = sc.lastIndexOf("Java");

        System.out.println(sc.contains("Java"));

        if (index == -1) {
            System.out.println("Подстрока \"Java\" не найдена");
        } else {
            System.out.println("Подстрока \"Java\" найдена в " + index);
        }
    }

    public static void strCheck6() {
        System.out.println("Введите строку, с символами: а");

        String sc = _scanner.next();

        System.out.println(sc.replace('a', 'o'));
    }

    public static void strCheck7() {
        System.out.println("Введите строку");

        String sc = _scanner.next();

        System.out.println(sc.toUpperCase());
    }

    public static void strCheck8() {
        System.out.println("Введите строку");

        String sc = _scanner.next();

        System.out.println(sc.toLowerCase());
    }

    public static void strCheck9() {
        System.out.println("Введите строку I like Java!!!");

        String sc = _scanner.next();

        String java = "Java";
        int index = sc.indexOf(java);

        int lastIndex = index + java.length();
        String myStr = sc.substring(0, index) + sc.substring(lastIndex, sc.length());

        System.out.println(myStr);
    }

    private static void Excercise2() {
        System.out.println("Введите Имя");
        String name = _scanner.next();

        System.out.println("Введите Предмет");
        String subject = _scanner.next();

        System.out.println("Введите Оценку");
        String grade = _scanner.next();
        String result = String.format("Студент %1.15s Получил %1.3s по %1.10s", name, grade, subject);
        System.out.printf(result);
    }

    private static void Excercise3() {
        System.out.println("Введите слова через пробел");
        String input = _scanner.next();
        String[] words = input.split(" ");
        int degree = Integer.MAX_VALUE;
        String word="";
        for (int i = 0; i < words.length; i++) {
            int check = 1;
            for (int k = 0; k < words[i].length() - 1; k++) {
                if (words[i].charAt(k) != words[i].charAt(k + 1)) {
                    check++;
                }
            }
            if (check < degree) {
                degree = check;
                word = words[i];
            }
        }
        System.out.println(word);
    }

}