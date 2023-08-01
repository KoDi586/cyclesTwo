public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }

    public static void task1() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 1 =========\n" +
                "=============================\n");

        int salary = 15_000;
        int total = 0;
        short month = 0;
        int finishSum = 2_459_000;
        while (total <= finishSum){
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

        System.out.print("\n");

        for (; num > 0; num--){
            System.out.print(num + " ");
        }
    }
    public static void task3() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 3 =========\n" +
                "=============================\n");

        double birth;
        float birthPercent = 17/1000f;
        double dead;
        float deadPercent = 8/1000f;
        double total = 12_000_000;

        byte finishYear = 10;

        for (byte year = 1; year <= finishYear; year++){
            dead = total * deadPercent;
            birth = total * birthPercent;
            total = total + birth - dead;
            System.out.println("Год " + year + ", численность населения составляет " + (int) total);
        }
    }

    public static void task4() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 4 =========\n" +
                "=============================\n");


        double total = 15_000d;
        float percent = 1.07f;
        int finish = 12_000_000;

        for (int month = 1; total <= finish; month++) {
            total *= percent;
            System.out.println("Месяц " + month + ", накопления составляют " + (int) total);
        }
    }

    public static void task5() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 5 =========\n" +
                "=============================\n");

        double total = 15_000d;
        float percent = 1.07f;
        int finish = 12_000_000;

        for (int month = 1; total <= finish; month++) {
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

        double total = 15_000d;
        float percent = 1.07f;
        int finishMonth = 12 * 9;

        for (int month = 1; month <= finishMonth; month++) {
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

        int finishDay = 31;

        for (int Friday = 3; Friday <= finishDay; Friday+=7) {
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