package cycles.lessonOne;

public class CyclesLessonOne {
    public static void main(String[] args) {
        System.out.println("Task 1");
        task1();
        System.out.println();
        System.out.println("Task 2");
        task2();
        System.out.println();
        System.out.println("Task 3");
        task3();
        System.out.println();
        System.out.println("Task 4");
        task4();
        System.out.println();
        System.out.println("Task 5");
        task5();
        System.out.println();
        System.out.println("Task 6");
        task6();
        System.out.println();
        System.out.println("Task 7");
        task7();
        System.out.println();
        System.out.println("Task 8");
        task8();
        System.out.println();
        System.out.println("Task 9");
        task9();
        System.out.println();
        System.out.println("Task 10");
        task10();
    }
    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
    }

    public static void task2() {
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i);
        }
    }

    public static void task3() {
        for (int i = 0; i <= 17; i = i + 2) {
//            if (i % 2 == 0) {
//                System.out.print(" " + i);
//            }
            System.out.print(" " + i);
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
    }

    public static void task6() {
        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(" " + i);
        }
    }

    public static void task7() {
        for (int i = 1; i < 600; i = i * 2) {
            System.out.print(" " + i);
        }
    }

    public static void task8() {
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " руб.");
        }
    }

    public static void task10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + "*" + i + "=" + (i * 2));
        }

    }
}
