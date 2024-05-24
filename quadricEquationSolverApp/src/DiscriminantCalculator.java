public class DiscriminantCalculator {
    public static double calculateDiscriminant(double a, double b, double c) {

        double discriminant = (Math.pow(b,2) - 4 * a * c);
        System.out.println("The discriminant is " + discriminant);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("There are 2 roots " + x1 + " and " + x2);
        }
        else if (discriminant == 0) {
            double x0 = (- b) / (2 * a);
            System.out.println("So there is one root ");
        }
        else System.out.println("There are no real roots ");
        return discriminant;
    }
}
