package cycles.lessonTwo;

public class CyclesLesssonTwo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Task 1");
        task1();
        System.out.println();
        System.out.println("Task 2");
        task2();
        System.out.println();
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
    }

    public static void task1() {
        int deposit = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " руб.");
        }
    }

    public static void task2() {
        {int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }}
        System.out.println();
        int i = 10;
        for (; i > 0; i--) {
            System.out.print(" " + i);
        }
    }

    public static void task3() {
        double population = 12000000;
        double growthPercent = (double) 9 / 1000; //Процент прироста населения (17 - 8 = 9)
        int period = 0;
        while (period < 10) {
            population = population + population * growthPercent; // Вычисляется прирост населения за год
            period++;
            System.out.println("Год " + period +
                    ", численность населения составляет " +
                    Math.round(population)); // округление до ближайшего целого числа
        }
    }

    public static void task4() {
        int deposit = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + (total * 7) / 100;
            total = total + deposit;
            i++;
            System.out.println("Месяц " + i + ". Сумма накоплений " + total + " рублей.");
        }
        System.out.println("Для накопления 12 млн. рублей на данном депозите понадобится " + i + " месяцев.");
    }

    public static void task5() {
        int deposit = 15_000;
        int total = 0;
        int i = 0;
        while ( total < 12_000_000) {
            total = total + (total * 7) / 100;
            total = total + deposit;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений " + total + " рублей.");
            }
        }
        System.out.println("Для накопления 12 млн. рублей на данном депозите понадобится " + i + " месяцев.");
    }

    public static void task6() {
        int deposit = 15_000;
        int total = 0;
        int i = 0;
        while (i < 9 * 12) {
            total = total + (total * 7) / 100;
            total = total + deposit;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений " + total + " рублей.");
            }
        }
        System.out.println("За девять лет или за " + i + " месяцев на данном " +
                "депозите накопится " + total + " рублей.");
    }

    public static void task7() {
        int friday = 1;
        int day = 0;
        while (day < 31) {day++;
            if (day % friday == 0) {
                friday = friday + 7; //если не объявить пятницу каждым седьмым днем - то все дни будут птн.
                System.out.println("Сегодня пятница " + day + "-e число - пора сдавать отчет");
            }
        }
    }

    public static void task8() {
        int zeroYear = 0;
        int lastYear = 2023 - 200;
        int futureYear = 2023 + 100;
        int flybyComet = zeroYear;
        while (flybyComet <= futureYear) {
            flybyComet += 79;
            if (flybyComet > lastYear && flybyComet < futureYear) {
                System.out.println(flybyComet);
            }
        }

    }
}

