public class Main {
    public static void main(String[] args) {
        Point[] firstLinePoints = {new Point(1, 5), new Point(2, 8), new Point(5, 3)};
        BrokenLine firstLine = new BrokenLine(firstLinePoints);
        System.out.println("Длина ломаной: " + firstLine.getLength());
        Point[] newPoints = {new Point(5, 15), new Point(8, 10)};
        firstLine.addPoints(newPoints);

        System.out.println("Длина ломаной после добавления точек: " + firstLine.getLength());
    }
}