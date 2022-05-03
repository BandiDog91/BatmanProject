package HW4;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника = " + areaOfATriangle(3, 4, 5));
    }

    public static double areaOfATriangle (double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
