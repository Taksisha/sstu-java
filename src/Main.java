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

        A.arrayCities.add(new arrayCity(F, 1));
        A.arrayCities.add(new arrayCity(B, 5));
        A.arrayCities.add(new arrayCity(D, 6));

        B.arrayCities.add(new arrayCity(A, 5));
        B.arrayCities.add(new arrayCity(C, 3));

        C.arrayCities.add(new arrayCity(B, 3));
        C.arrayCities.add(new arrayCity(D, 4));

        D.arrayCities.add(new arrayCity(C, 4));
        D.arrayCities.add(new arrayCity(E, 2));
        D.arrayCities.add(new arrayCity(A, 6));

        E.arrayCities.add(new arrayCity(F, 2));

        F.arrayCities.add(new arrayCity(E, 2));
        F.arrayCities.add(new arrayCity(B, 1));

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}