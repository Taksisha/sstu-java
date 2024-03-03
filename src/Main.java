//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10000);
        Time time2 = new Time(2, 3, 5);

        System.out.println("10000 секунд: " + time1.getTimeString());
        System.out.println("2 часа, 3 минуты, 5 секунд: " + time2.getTimeString());
    }
}
