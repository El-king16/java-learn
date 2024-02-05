import java.util.Scanner;
import java.util.Random;
public class Bot_ran {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(9) + 1;
        Scanner input = new Scanner(System.in);
        int attempts = 3;
        System.out.println("Компьютер загадал число от 1 до 9. У вас есть 3 попытки, чтобы угадать это число.");
        while (attempts > 0) {
            System.out.print("Введите ваше число: ");
            int userNumber = input.nextInt();
            if (userNumber > 9 || userNumber < 1){
                System.out.println("Некоректное число");
                continue;
            }
            if (userNumber == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число!");
                break;
            } else if (userNumber < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
            attempts--;
            if (attempts > 0) {
                System.out.println("У вас осталось " + attempts + " попыток.");
            } else {
                System.out.println("У вас закончились попытки. Загаданное число было: " + secretNumber);
            }
        }
    }
}