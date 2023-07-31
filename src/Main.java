public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 1 =========\n" +
                "=============================\n");

        int salary = 15_000;
        int total = 0;
        short month = 0;
        while (total <= 2_459_000){
            month++;
            total += salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    }
    public static void task2() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 2 =========\n" +
                "=============================\n");

        int num = 0;
        while (num < 10){
            num++;
            System.out.print(num + " ");
        }

        System.out.println("");

        for (; num > 0; num--){
            System.out.print(num + " ");
        }
    }
    public static void task3() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 3 =========\n" +
                "=============================\n");

        int birth;
        int dead;
        int total = 12_000_000;
        byte year = 1;

        for (; year <= 10; year++){
            dead = total/1000 * 8;
            birth = total/1000 * 17;
            total = total + birth - dead;
            System.out.println("Год " + year + ", численность населения составляет " + total);
        }
    }

    public static void task4() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 4 =========\n" +
                "=============================\n");


        int total = 15_000;
        float percent = 1.07f;
        int month = 1;

        for (; total <= 12_000_000; month++) {
            total *= percent;
            System.out.println("Месяц " + month + ", накопления составляют " + total);
        }
    }

    public static void task5() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 5 =========\n" +
                "=============================\n");

        int total = 15_000;
        float percent = 1.07f;
        int month = 1;

        for (; total <= 12_000_000; month++) {
            total *= percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления составляют " + total);
            }

        }
    }

    public static void task6() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 6 =========\n" +
                "=============================\n");

        int total = 15_000;
        float percent = 1.07f;
        int month = 1;
        int finishMonth = 12 * 9;

        for (; month <= finishMonth; month++) {
            total *= percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления составляют " + total);
            }

        }
    }

    public static void task7() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 7 =========\n" +
                "=============================\n");

        int Friday = 3;
        int finishDay = 31;

        for (; Friday <= finishDay; Friday+=7) {
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет.");
        }

    }
    public static void task8() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 8 =========\n" +
                "=============================\n");

        int oldYear = 2023 - 200;
        int finishYear = 2023 + 100;
        int firstFly = oldYear - oldYear % 79 + 79;

        for (; firstFly <= finishYear; firstFly += 79) {
            System.out.println(firstFly);
        }
    }


}