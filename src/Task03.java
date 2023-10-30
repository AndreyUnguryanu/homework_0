import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание№3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете животное:");
        System.out.println("1.Кошка");
        System.out.println("2.Собака");
        System.out.println("3.Слон");
        System.out.println("4.Дельфин");
        System.out.println("5.Утка");
        System.out.println("6.Курица");
        System.out.println("7.Лев");
        System.out.println("8.Корова");
        System.out.println("9.Стас");
        System.out.println("10.Овца");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Собака");
                break;
            case 3:
                System.out.println("ууууу");
                break;
            case 4:
                System.out.println("уруруруру");
                break;
            case 5:
                System.out.println("кря");
                break;
            case 6:
                System.out.println("ко-ко");
                break;
            case 7:
                System.out.println("ррр");
                break;
            case 8:
                System.out.println("му");
                break;
            case 9:
                System.out.println("Здарова заебал");
                break;
            case 10:
                System.out.println("мее");
                break;
            default:
                System.out.println();
        }
    }
}
