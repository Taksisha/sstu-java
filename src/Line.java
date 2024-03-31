public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint.getX(), startPoint.getY());
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint.setX(startPoint.getX());
        this.startPoint.setY(startPoint.getY());
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint.setX(endPoint.getX());
        this.endPoint.setY(endPoint.getY());
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public String toString() {
        return "Линия от " + startPoint.toString() + " до " + endPoint.toString();
    }

    public int getLength() {
        int length = (int) Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
        return length;
    }
}
