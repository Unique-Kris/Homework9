public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1 ");
        int[] payments = {50_000, 57_000, 55_000, 53_000, 54_000};
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задание 2 ");
        int[] payments = {7_000, 5_000, 9_000, 8_000, 4_000};
        int maxPayments = -1;
        for (int current : payments) {
            if (current > maxPayments) {
                maxPayments = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayments + " рублей");
        int minPayments = payments[0];
        for (int i = 0; i < payments.length; i++) {
            if (minPayments > payments[i]) {
                minPayments = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments + " рублей");
    }

    public static void task3() {
        System.out.println("Задание 3 ");
        int[] payments = {11_000, 8_000, 9_000, 12_000, 7_000};
        int sum = 0;
        int mediumSum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
            mediumSum = sum / payments.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mediumSum + " рублей");
    }

    public static void task4() {
        System.out.println("Задание 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char name = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            name += reverseFullName[i];
            System.out.print(reverseFullName[i]);
        }
    }
}