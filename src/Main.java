
public class Main {
    public static void main(String[] args) {
        Point startPoint = new Point(1, 1);
        Point endPoint = new Point(10, 15);

        Line line = new Line(startPoint, endPoint);
        System.out.println("Длина линии: " + line.getLength());

        // Изменение координат точки начала
        startPoint.setX(5);
        startPoint.setY(5);

        System.out.println("Новые координаты начала: " + line.getStartPoint());

        // Изменение координат точки конца
        endPoint.setX(20);
        endPoint.setY(30);

        System.out.println("Новые координаты конца: " + line.getEndPoint());
    }
}