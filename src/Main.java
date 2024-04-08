//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);

        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.subtract(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));

        Fraction result = f1.add(f2).divide(f3).subtract(5);
        System.out.println(f1 + " + " + f2 + " / " + f3 + " - 5 = " + result + "\n");

        Fraction f4 = new Fraction(-1, 3);
        Fraction f5 = new Fraction(2, -3);

        System.out.println(f4 + " * " + f5 + " = " + f4.multiply(f5));
        System.out.println(f4 + " + " + f5 + " = " + f4.add(f5));
        System.out.println(f4 + " - " + f5 + " = " + f4.subtract(f5));
        System.out.println(f4 + " / " + f5 + " = " + f4.divide(f5));
    }
}