package exam1;
import java.util.Scanner;
public class FinancialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] expenses = new int[30];
        while (true) {
            System.out.println("Меню:");
            System.out.println("1 – Ввести расходы за определенный день");
            System.out.println("2 – Траты за месяц");
            System.out.println("3 – Самая большая сумма расхода за месяц");
            System.out.println("0 – Выход");
            System.out.print("Выберите пункт меню: ");
            int num_menu = scanner.nextInt();

            if (num_menu == 1) {
                System.out.print("Введите день (от 1 до 30): ");
                int day = scanner.nextInt();
                System.out.print("Введите сумму трат: ");
                int amount = scanner.nextInt();

                if (expenses[day - 1] != 0) {
                    System.out.print("За этот день уже указаны траты, перезаписать? (да/нет): ");
                    String rewrite = scanner.next();

                    if (rewrite.equalsIgnoreCase("да")) {
                        expenses[day - 1] = amount;
                    }
                } else {
                    expenses[day - 1] = amount;
                }
            } else if (num_menu == 2) {
                System.out.println("Траты за месяц:");
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] != 0) {
                        System.out.println((i + 1) + " день – " + expenses[i] + " руб");
                    }
                }
            } else if (num_menu == 3) {
                int maxExpense = 0;
                int maxDay = 0;
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > maxExpense) {
                        maxExpense = expenses[i];
                        maxDay = i + 1;
                    }
                }
                System.out.println("Самая большая сумма расхода за месяц: " + maxDay + " день – " + maxExpense + " руб");
            } else if (num_menu == 0) {
                System.out.println("До свидания!");
                System.exit(0);
            } else {
                System.out.println("Неверный выбор, попробуйте снова");
            }
        }
    }
}

