public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Первая");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача Вторая");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача Третья");
        for (int i = 0; i <= 16; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задача Четвертая");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача Пятая");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача Шестая");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("Задача Седьмая");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задача Восьмая");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача Девятая");
        int salaryProcent = 29000;
        int totalProcent = 0;
        for (int i = 1; i <= 12; i++) {
            totalProcent = totalProcent + salary;
            totalProcent = totalProcent + totalProcent / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalProcent + " рублей");
        }
        System.out.println("Задача Деcятая");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int result = number*i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}