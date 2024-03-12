public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Line(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }
    public String toString() {
        return "Линия от " + startPoint.toString() + " до " + endPoint.toString();
    }

    public int getLength() {
        int length = (int) Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));
        return length;
    }
}
