import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 целых числа:");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b)
                System.out.println("a > b");
            else if (a < b)
                System.out.println("a < b");

            else
                System.out.println("a = b");
            System.out.println("Сумма двух чисел: " + (a + b));
            System.out.println("Разность двух чисел: " + (a - b));
            System.out.println("Произведение двух чисел: " + (a * b));
            if (b != 0)
                System.out.println("Результат деления двух чисел: " + (double) (a) / (double) (b));
            else
                System.out.println("Результат деления двух чисел: деление на ноль невозможно");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: Введены некорректные данные. Введите целые числа.");
        }
    }
}