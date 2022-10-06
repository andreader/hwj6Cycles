public class Main {
    static int task;
    public static void t() {
        task++;
        System.out.println();
        System.out.println("Task №" + task);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Homework 1");
        t();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        t();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
        }
        t();
        for (int i = 0; i <= 17; i++) {
            if (i%2 == 0 && i != 0) {
                System.out.print(i);
            }
        }
        t();
        for (int i = 10; i >= -10; i--) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Homework 2");
        t();
        for (int i = 1904; i < 2096; i=i+4) {
            System.out.printf("The year %s is leap",i);
            System.out.println();
        }
        t();
        for (int i = 7; i < 98; i=i+7) {
            System.out.print(i);
        }
        t();
        for (int i = 1; i < 512; i=i*2) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Homework 3");
        t();
        int save = 0;
        for (int i = 1; i <= 12; i++) {
            save += 29000;
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей. %n", i, save);
            }
        t();
        int save1 = 0;
        int interest = 1;
        for (int i = 1; i <= 12; i++) {
            save1 += 29000;
            save1 = save1 + interest * save1/100;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей. %n", i, save1);
        }
        }
    }
