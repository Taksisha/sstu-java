class Point3D extends Point {
    double z;

    public Point3D(double x, double y, double z) {
        super(x, y); // Вызов конструктора суперкласса для инициализации x и y
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }
}
