import java.util.Scanner;
public class Posuda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double posuda = sc.nextDouble();
        double milo = sc.nextDouble();
        for (int i = 0; i < posuda; i++) {
            if (milo < 1) {
                System.out.println("Моющее средство закончилось!");
                break;
            }
            milo -= 0.5;
            System.out.println(milo);

        }
    }
}
