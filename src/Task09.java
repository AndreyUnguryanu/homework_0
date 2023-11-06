import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введитекоординаты начала отрезка (x1, y1): ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Введитекоординаты конца отрезка (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (x1 == x2 && y1 == y2) {
            System.out.println("Отрезок является точкой.");
        } else if (x1 == x2) {
            System.out.println("Отрезок является вертикальной линией.");
        } else {
            double slope = (y2 - y1) / (x2 - x1);

            if (slope == 0) {
                System.out.println("Отрезок является горизонтальной линией.");
            } else if (slope > 0) {

                System.out.println("Отрезокявляется подъемом.");

            } else {
                System.out.println("Отрезок является спуском.");
            }
        }
    }
}