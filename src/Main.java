//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addRoad(B, 5);
        A.addRoad(F, 1);
        A.addRoad(D, 6);

        B.addRoad(C, 3);

        C.addRoad(D, 4);

        D.addRoad(E, 2);

        E.addRoad(F, 2);

        F.addRoad(B, 1);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}