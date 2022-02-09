import java.util.Scanner;

public  class lesson_5 {
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
            case 4:
                Excercise4();
                break;
            case 5:
                Excercise5();
                break;
            case 6:
                Excercise6();
                break;
            case 7:
                Excercise7();
                break;
            default:
                System.out.println("Это не номер задачи!");
        }
    }

    private static void Excercise1() {
        int[] myNum = {1000, 1003, 1006, 1009, 1012, 1015};
        for (int i = 0; i < myNum.length; i ++){
            System.out.println(myNum[i]);
        }
    }

    private static void Excercise2() {
        int[] myNum = {10, 6, 2, -2, -6, -10};
        for (int i : myNum) {
            if(i > 0) {
                System.out.println(i);
            }
        }
    }

    private static void Excercise3() {
        System.out.println("Введите число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            int result = 1;
            for (int i = 1; i <= myNum; ++i) {
                result *= i;
            }
            System.out.println(result);
        }
    }

    private static void Excercise4() {
        System.out.println("Введите натуральное число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            if (myNum < 0) {
                System.out.println("Спасибо! Вы ввели не то что нужно");
                return;
            }
            String s = String.valueOf(myNum);
            int result = 0;
            for (int i = 0; i < s.length(); i++)
            {
                result += s.charAt(i) - '0';
            }
            System.out.println(result);
        }
    }

    private static void Excercise5() {
        int[] arr = new int[10];
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[count] = i;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void Excercise6() {
        int[] arr = new int[50];
        int count = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                arr[count] = i;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void Excercise7() {
        int length = 5;
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < length; i++) {
            arr1[i] = getRandomNumber(0,5);
            arr2[i] = getRandomNumber(0,5);
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        System.out.println("Первый массив");
        for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Второй массив");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        int result1 = sum1 / 5;
        int result2 = sum2 / 5;

        System.out.println(" ");
        if (result1 < result2) {
            System.out.println("Среднее арифметическое первого массива больше");
            return;
        } else if (result1 == result2) {
            System.out.println("Среднее арифметическое массивов одинаковое");
            return;
        } else {
            System.out.println("Среднее арифметическое второго массива больше");
            return;
        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
