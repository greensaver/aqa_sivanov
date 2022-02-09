import java.util.Scanner;

public  class lesson_4 {
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
            case 8:
                Excercise8();
                break;
            case 9:
                Excercise9();
                break;
            default:
                System.out.println("Это не номер задачи!");
        }
    }

    private static void Excercise1() {
        System.out.println("Введите сантиметры:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            _scanner.next();
        } else {
            int inches = _scanner.nextInt();
            double a = inches / 2.54;
            System.out.println("Спасибо! В сантиметрах это " + a);
        }

        System.out.println("Введите дюймы:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            _scanner.next();
        } else {
            int cm = _scanner.nextInt();
            double b = cm * 2.54;
            System.out.println("Спасибо! В дюймах это " + b);
        }
    }

    private static void Excercise2() {
        System.out.println("Сколько у Васи денег?:");
        if (!_scanner.hasNextInt()) {
            System.out.println("Родина не отпустит Васю");
            _scanner.next();
        } else {
            int evro = _scanner.nextInt();
            int a = 5000 / 28;
            int b = ( evro / 28 ) + a;
            System.out.println("Капуста Васи и его родителей " + b);
        }
    }

    private static void Excercise3() {
        System.out.println("Введите двузначное число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            String s = String.valueOf(myNum);
            int checkmyNum = s.length();

            if((checkmyNum != 2) || (myNum < 0)) {
                System.out.println("Спасибо! Вы ввели не то что нужно");
            }
            System.out.println(s.charAt(1) + " " + s.charAt(0));
        }
    }

    private static void Excercise4() {
        System.out.println("Введите двузначное число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            String s = String.valueOf(myNum);
            int checkmyNum = s.length();

            if((checkmyNum != 2) || (myNum < 0)) {
                System.out.println("Спасибо! Вы ввели не то что нужно");
            }
            int a = myNum % 10;
            int b = myNum - a;

            System.out.println(b + " + " + a);
        }
    }

    private static void Excercise5() {
        System.out.println("Введите двузначное число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            String s = String.valueOf(myNum);
            int checkmyNum = s.length();

            if((checkmyNum != 2) || (myNum < 0)) {
                System.out.println("Спасибо! Вы ввели не то что нужно");
            }
            System.out.println((myNum / 10) + (myNum % 10));
        }
    }

    private static void Excercise6() {
        System.out.println("Введите двузначное число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            String s = String.valueOf(myNum);
            int checkmyNum = s.length();

            if((checkmyNum != 2) || (myNum < 0)) {
                System.out.println("Спасибо! Вы ввели не то что нужно");
            }
            int a = (GetEvenDegree(myNum / 10) + GetEvenDegree(myNum % 10));
            System.out.println(a);
        }
    }

    private static void Excercise7() {
        System.out.println("Введите число:");

        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            if (myNum > 0) {
                System.out.println("Положительное");
            } else if (myNum < 0) {
                System.out.println("Отрицательное");
            } else if (myNum == 0) {
                System.out.println("Ноль");
            }
        }
    }

    private static void Excercise8() {
        System.out.println("Введите число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            String s = String.valueOf(myNum);
            int checkmyNum = s.length();

            if ((checkmyNum >= 3) && (myNum > 0)) {
                System.out.println(myNum - 1);
            }
        }
    }

    private static void Excercise9() {
        System.out.println("Введите двузначное число:");
        if (!_scanner.hasNextInt())  {
            System.out.println("Спасибо! Вы ввели не то что нужно");
            return;
        } else {
            int myNum = _scanner.nextInt();
            String s = String.valueOf(myNum);
            int checkmyNum = s.length();

            if((checkmyNum != 2) || (myNum < 0)) {
                System.out.println("Спасибо! Вы ввели не то что нужно");
                return;
            }
            int a = ((myNum / 10) * (myNum % 10));
            int result;

            if (a > myNum) {
                result = a;
            } else {
                result = myNum;
            }

            System.out.println("Хаха, число опять больше произведения " + result);
        }
    }


    private static int GetEvenDegree(int num) {
        if (num == 0)
            return 0;
        return (num % 2 == 0) ? 1 : 0;
    }
}
