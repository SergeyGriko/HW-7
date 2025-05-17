public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Первая");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Задача Вторая");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача Третья");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задача Четвертая");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("Задача Пятая");
        for (int i = 1904; i < 2097; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }
}