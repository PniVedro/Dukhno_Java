import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите две строки: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.equals(str2))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }
}