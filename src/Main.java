//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        double length1 = calculateLineLength(1, 2, 3, 4);
        double length2 = calculateLineLength(5, 6, 7, 8);

        int comparison = Double.compare(length1, length2);
        if (comparison == 0) {
            System.out.println("The two lines are equal.");
        } else if (comparison > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }
    }

    public static double calculateLineLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}