public class RandArr {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int)(Math.random()*1000);
            System.out.println(arr[i]);
            sum += arr[i];

        }
        System.out.println(" ");
        System.out.println("Сумма расходов составила "+sum+ " рублей");
    }
}
