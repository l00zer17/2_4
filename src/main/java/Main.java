import java.util.Scanner;
public class Main {
    public static boolean czyProstokątny(double a, double b, double c) {
        double[] boki = {a, b, c};
        java.util.Arrays.sort(boki);
        return Math.abs(boki[0] * boki[0] + boki[1] * boki[1] - boki[2] * boki[2]) < 1e-6;
    }
    public static double obliczPole(double a, double b) {
        return 0.5 * a * b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego boku: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj długość drugiego boku: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj długość trzeciego boku: ");
        double c = scanner.nextDouble();
        boolean isRightTriangle = czyProstokątny(a, b, c);
        if (isRightTriangle) {
            System.out.println("Trójkąt jest prostokątny.");
            double pole = obliczPole(a, b);
            System.out.println("Pole trójkąta prostokątnego wynosi: " + pole);
        } else {
            System.out.println("Trójkąt nie jest prostokątny.");
        }
        scanner.close();
    }
}
