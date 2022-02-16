import java.util.Scanner;
import java.util.regex.Pattern;

public class lesson_6 {
    private static Scanner _scanner;

    public static void Run() {
        _scanner = new Scanner(System.in);
        System.out.println("Введите числа разделенные пробелом, например 2 + 2");
        try {
            int x = getInt();
            char operator = getOperation();
            int y = getInt();
            int result = calc(x, y, operator);
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так! Проверьте свое выражение!");
        }
    }

    public static int getInt() {
        return _scanner.nextInt();
    }

    public static char getOperation() {
        String input = _scanner.next(Pattern.compile("([\\*\\+\\-\\/]{1})"));
        char result = input.trim().charAt(0);
        return result;
    }

    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
        }
        return 0;
    }







}