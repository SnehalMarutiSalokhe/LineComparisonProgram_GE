//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double length1 = calculateLineLength(1, 2, 3, 4);
        double length2 = calculateLineLength(5, 6, 7, 8);

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        checkEquality(length1, length2);

        compareLines(length1, length2);
    }

    public static double calculateLineLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void checkEquality(double length1, double length2) {
        if (Double.valueOf(length1).equals(Double.valueOf(length2))) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }

    public static void compareLines(double length1, double length2) {
        int comparison = Double.compare(length1, length2);
        if (comparison == 0) {
            System.out.println("The two lines are equal.");
        } else if (comparison > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }
    }
}