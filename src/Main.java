//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Point[] firstLinePoints = {new Point(1, 5), new Point(2, 8), new Point(5, 3)};
        BrokenLine firstLine = new BrokenLine(firstLinePoints);
        System.out.println(firstLine);

        Point[] secondLinePoints = {firstLinePoints[0], new Point(2, -5), new Point(4, -8), firstLinePoints[firstLinePoints.length-1]};
        BrokenLine secondLine = new BrokenLine(secondLinePoints);
        System.out.println(secondLine);

        // Shift both lines
        firstLine.shift(1, 1);
        System.out.println(firstLine);
        System.out.println(secondLine);
    }
}
