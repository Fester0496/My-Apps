import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Please type the coefficients ");
        System.out.println("a: ");
        double a = in.nextDouble();
        System.out.println("b: ");
        double b = in.nextDouble();
        System.out.println("and c: ");
        double c = in.nextDouble();
        DiscriminantCalculator.calculateDiscriminant(a, b, c);

    }
}
