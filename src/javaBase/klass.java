import java.util.Scanner;
public class klass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int money = 1000000;
        int count = 0;
        while (x < money){
            x += x * 0.1;
            count++;
        }
        System.out.println(count);
    }
}
