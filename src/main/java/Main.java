import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = calculateHexagonArea(side);
        System.out.printf("The area of the hexagon is %.2f\n", area);

        input.close();
    }

    public static double calculateHexagonArea(double s) {
        return (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
    }
}