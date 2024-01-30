import java.util.Scanner;
public class Bot_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.nextLine();
        System.out.println("Введите ваш час в формате 24 часа");
        int x = sc.nextInt();
        switch (x){
            case 4, 5, 6, 7, 9, 10, 11, 12:
                System.out.println("Доброе утро, " +name);
                break;
            case 13, 14, 15, 16, 17, 18:
                System.out.println("Добрый день, "+name);
                break;
            case 19, 20, 21, 22, 23:
                System.out.println("Добрый вечер, "+name);
                break;
            case 24, 0, 1, 2, 3:
                System.out.println("Доброй ночи, " +name);
                break;
        }
    }
}
