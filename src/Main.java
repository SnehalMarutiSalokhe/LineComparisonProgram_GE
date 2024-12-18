// UC4: Line Comparison using OOP
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        System.out.println("Length of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());

        if (line1.isEqual(line2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        int comparison = line1.compareTo(line2);
        if (comparison == 0) {
            System.out.println("The two lines are equal.");
        } else if (comparison > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }
}
