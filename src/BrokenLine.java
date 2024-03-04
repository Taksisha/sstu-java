import java.util.Arrays;

public class BrokenLine {
    Point[] points;

    public BrokenLine(Point[] points) {
        this.points = points;
    }
    public BrokenLine() {
        this.points = new Point[0];
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(points);
    }

    public void shift(int dx, int dy) {
        for (Point point : points) {
            point.x += dx;
            point.y += dy;
        }
    }
}
