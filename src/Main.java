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


    }
}

