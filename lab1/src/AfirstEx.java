import java.util.Scanner;

public class AfirstEx {
    public static void run()  {
        System.out.println("Первое задание");
        Scanner scanner = new Scanner(System.in); // Используем его дня считывания с консоли
        int number = scanner.nextInt();
        int lastNumber = number % 10; //последняя цифра - остаток от деления числа на 10
        System.out.println(lastNumber);
    }
}
