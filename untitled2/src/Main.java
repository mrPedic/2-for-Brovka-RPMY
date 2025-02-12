import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    final static double pi = 3.141592658979;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\tЗадание 1 ");
        System.out.print("Введите х : ");
        int x = scanner.nextInt();
        System.out.print("Введите y : ");
        int y = scanner.nextInt();

        double sum = pi + pow(3,x) - 4*x +3 * ( 16 * y - 2* pow(y,2) + 2 * pow(x,3) + pi);
        System.out.println("Результат : "+sum);

        System.out.println("\t\t\t\tЗадание 2 ");
        System.out.print("Введите длину первого основания трапеции : ");
        double a = scanner.nextDouble();
        System.out.print("Введите длину второго основания трапеции : ");
        double b =scanner.nextDouble();
        System.out.print("Введите высоту : ");
        double h = scanner.nextDouble();
        double s = (a*b*h)/2;

        System.out.println("Площадь трапеции равна : " + s);
    }
}