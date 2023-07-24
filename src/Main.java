public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10(2);

    }

    static void task1() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    static void task2() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void task3() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void task4() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }

    static void task5() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    static void task6() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
    }

    static void task7() {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }

    static void task8() {
        System.out.println("\nЗадание " + counter++ + ":");
        int money = 29000;
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            sum = money * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
    }

    static void task9() {
        System.out.println("\nЗадание " + counter++ + ":");
        int money = 29000;
        double total = 0;
        int moneyWithPenny = money * 100;
        int totalWithPenny = 0;

        for (int i = 1; i <= 12; i++) {

            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + moneyWithPenny;
            total = totalWithPenny / 100;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    static void task10(int num) {
        System.out.println("\nЗадание " + counter++ + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}