public class Time {
    private int seconds;
    public Time(int seconds) {
        this.seconds = seconds % 86400; // учитываем только время с начала последних суток
    }

    public String getTimeString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        return hours + ":" + minutes + ":" + sec;
    }
}
