import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine {
    List points;

    public BrokenLine(Point[] points) {
        this.points = new ArrayList<>(Arrays.asList(points));
    }

    public int getLength() {
        int length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += Math.abs(p2.x - p1.x) + Math.abs(p2.y - p1.y);
        }
        return length;
    }

    public void addPoints(Point[] newPoints) {
        points.addAll(Arrays.asList(newPoints));
    }
}