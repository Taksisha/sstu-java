//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(34056);
        Time time2 = new Time(4532);
        Time time3 = new Time(123);

        System.out.println("Часов в 34056 секундах: " + time1.getCurrentHour());
        System.out.println("Минут в 4532 секундах: " + time2.getMinutesPassedThisHour());
        System.out.println("Секунд в 123 секундах: " + time3.getSecondsPassedThisSeconds());
    }
}
