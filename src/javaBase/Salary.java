package javaBase;
import java.util.Scanner;
public class Salary {

    public static void main(String[] args) {
        int salary = enterSalary();
        int food = enterFood();
        int auto = enterAuto();
        int save = enterSave();
        int total = food + auto + save;
        System.out.println(total);
        if (salary > total){
            System.out.print("Излишек равен - " );
            System.out.println(salary - total);
        } else if (total > salary) {
            System.out.print("Недостаток равен - ");
            System.out.println(total - salary);
        }

    }

    public static int enterSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемую зарплату:");
        int salary = sc.nextInt();
        if (salary > 500000000){
            System.out.println("По моему это число ближется к максимальному значению int'a\nПерезаписывай:");
            salary = sc.nextInt();
        } else if (salary < 600) {
            System.out.println("З/п даже меньше чем у студента  ;D\nПерезапиши:");
            salary = sc.nextInt();
        }
        System.out.println("//"+salary);
        return salary;
    }
    public static int enterFood(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ведите затраты на еду:");
        int food = sc.nextInt();
        if (food > 4000000){
            System.out.println("Вы Макс Максбетов?");
            System.out.println("Да/Нет:");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("да") || choice.equalsIgnoreCase("lf")){
                System.out.println("Вас понял, sir!");
            }else if (choice.equalsIgnoreCase("нет")){
                System.out.println("Вы не легенда, перезаписывайте:");
                food = sc.nextInt();
            }

        }
        if (food < 666){
            System.out.println("Вы умерли или ошиблись числом\nПерезапишите:");
            food = sc.nextInt();

        }
        System.out.println("//"+food);
        return food;
    }
    public static int enterAuto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите затраты на транспорт:");
        int auto = sc.nextInt();
        if (auto > 100000000){
            System.out.println("Похоже вы попадали в аварию больше 1 раза в месяц :(");
        }
        if (auto == 0){
            System.out.println("Вы пешеход? :D");
        }
        System.out.println("//"+auto);
        return auto;
    }
    public static int enterSave(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму на сбережение:");
        int save = sc.nextInt();
        if (save > 5000000){
            System.out.println("Инвестиции в себя я так понимаю?");
        }
        if (save == 0){
            System.out.println("То есть вообще всю з/п тратите?");
        }
        System.out.println("//"+save);
        return save;

    }

}
