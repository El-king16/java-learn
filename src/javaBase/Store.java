import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double promo = sc.nextDouble();
        if (promo == 4525){
            price *= 0.3;
            System.out.println(price+" рублей");
        }
        if (promo == 6424 || promo == 7012){
            price *= 0.2;
            System.out.println(price+" рублей");
        }
        if (promo == 7647 || promo == 9011 || promo == 6612){
            price *= 0.1;
            System.out.println(price+" рублей");
        }
        
    }
}
