
public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
        Line line2 = new Line(5, 10, 25, 10);
        Line line3 = new Line(new Point(1, 3), new Point(25, 10));

        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
    }
}