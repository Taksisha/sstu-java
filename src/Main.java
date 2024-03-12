
public class Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(10, 15));
        System.out.println("Длина линии: " + line.getLength());
    }
}