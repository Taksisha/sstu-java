//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println("10 секунд: " + time1.getTimeString());
        System.out.println("10000 секунд: " + time2.getTimeString());
        System.out.println("100000 секунд: " + time3.getTimeString());
    }
}