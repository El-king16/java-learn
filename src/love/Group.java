package love;
import love.Mount;
import love.People;
import java.util.Scanner;
import java.util.ArrayList;


public class Group {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            People[] arrPeople = new People[8]; //массив Людей
            People[] firstGroup = new People[3]; //первая группа
            People[] secondGroup = new People[3]; //vtoraya gruppa
            People[] thirdGroup = new People[3]; //третья группа

            People sanya = new People("Саня", 17, "Санкт-Петербург");
            People bobr = new People("Бобер", 52, "Варшава");
            People vlad = new People("Влад", 23, "Омск");
            People goose = new People("Фуфeлшмерц", 40, "Денвиль");
            People malenia = new People("Маления", 1000, "Элден");
            People yudji = new People("Юджи", 15, "Токио");
            People gege = new People("Гарри", 21, "Нью-Йорк");
            People fill = new People("Филл", 29, "Хельсинки");

            Mount elbrus = new Mount("Эльбрус", "Россия", 5600);
            Mount everest = new Mount("Эверест", "Тибет", 8800);
            Mount alpes = new Mount("Альпы", "Швейцария", 4800);

            arrPeople[0] = sanya;
            arrPeople[1] = bobr;
            arrPeople[2] = vlad;
            arrPeople[3] = goose;
            arrPeople[4] = malenia;
            arrPeople[5] = yudji;
            arrPeople[6] = gege;
            arrPeople[7] = fill;

            firstGroup[0] = bobr;
            firstGroup[1] = malenia;
            firstGroup[2] = vlad;

            secondGroup[0] = sanya;
            secondGroup[1] = goose;
            secondGroup[2] = yudji;

            thirdGroup[0] = gege;
            thirdGroup[1] = fill;

            String name;
            int age;
            String city;

            System.out.println("Список всех альпинистов:");
        for (People p : arrPeople){
            System.out.println(p.getName()+", "+p.getAge()+" лет, из города "+p.getAddress());
        }
            System.out.println("Идет ли набор в группу или нет?");
            String a = sc.nextLine();
            if (a.equalsIgnoreCase("да") || a.equalsIgnoreCase("lf")){

                    System.out.println("Выберите одну из трёх групп(1, 2, 3), чтобы добавить нового члена группы:");
                    int b = sc.nextInt();
                    switch (b){
                            case 1:
                                    if (firstGroup[0] != null || firstGroup[1] != null || firstGroup[2] != null){
                                            System.out.println("Группа переполнена!");

                                    }else {
                                            System.out.println("Введите нового члена группы:");

                                            People newp = new People("Игорь", 33, "Минск");
                                            firstGroup[2] = newp;
                                    }
                                    break;
                            case 2:
                                    if (secondGroup[0] != null || secondGroup[1] != null || secondGroup[2] != null){
                                            System.out.println("Группа переполнена!");
                                    }else {
                                            System.out.println("Введите нового члена группы:");

                                            People newp = new People("Игорь", 33, "Минск");
                                            secondGroup[2] = newp;
                                    }
                                    break;
                            case 3:
                                    if (thirdGroup[0] != null || thirdGroup[1] != null || thirdGroup[2] != null){
                                            System.out.println("Группа переполнена!");
                                    }else {
                                            System.out.println("Введите нового члена группы:");

                                            People newp = new People("Игорь", 33, "Минск");
                                            thirdGroup[2] = newp;
                                    }
                                    break;
                            default:
                                    System.out.println("Неверный выбор");
                                    break;
                    }
                    System.out.println("Выберите группу для вывода(1, 2, 3):");
                    int c = sc.nextInt();
                    switch (c){
                            case 1:
                                    for (People f : firstGroup){
                                            System.out.println(f.getName()+", "+f.getAge()+" лет, из города "+f.getAddress());

                                    }
                                    System.out.println(elbrus.getName());
                                    break;
                            case 2:
                                    for (People s : secondGroup){
                                            System.out.println(s.getName()+", "+s.getAge()+" лет, из города "+s.getAddress());

                                    }
                                    System.out.println(everest.getName());
                                    break;
                            case 3:
                                    for (People t : thirdGroup){
                                            System.out.println(t.getName()+", "+t.getAge()+" лет, из города "+t.getAddress());

                                    }
                                    System.out.println(alpes.getName());
                                    break;
                    }

            }
    }
}
