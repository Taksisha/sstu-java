public class Main {
    public static void main(String[] args) {
        Point startPoint1 = new Point(1.5, 2.0);
        Point endPoint1 = new Point(3.5, 4.0);
        Line line1 = new Line(startPoint1, endPoint1);

        Point startPoint2 = new Point(1.5, 2.0);
        Point endPoint2 = new Point(3.5, 4.0);
        Line line2 = new Line(startPoint2, endPoint2);

        Point startPoint3 = new Point(0.0, 0.0);
        Point endPoint3 = new Point(5.0, 5.0);
        Line line3 = new Line(startPoint3, endPoint3);

        // Тестирование методов equals и hashCode
        System.out.println("Сравнение line1 и line2: " + line1.equals(line2)); // Ожидаем true
        System.out.println("Хэш-код line1: " + line1.hashCode());
        System.out.println("Хэш-код line2: " + line2.hashCode());
        System.out.println("Сравнение line1 и line3: " + line1.equals(line3)); // Ожидаем false
        System.out.println("Хэш-код line1: " + line1.hashCode());
        System.out.println("Хэш-код line3: " + line3.hashCode());

        // Вывод информации о линиях
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        // Тестирование метода getLength()
        System.out.println("Длина line1: " + line1.getLength()); // Ожидаем ~2.83
        System.out.println("Длина line2: " + line2.getLength()); // Ожидаем ~2.83
        System.out.println("Длина line3: " + line3.getLength()); // Ожидаем ~7.07
    }
}
