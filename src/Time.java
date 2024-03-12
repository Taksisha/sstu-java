public class Time {
    private int seconds;

    public Time(int value) {
        if (value >= 86400) {
            this.seconds = value % 86400;
        } else {
            this.seconds = value;
        }
    }

    public Time(int hours, int minutes, int seconds) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    public String getTimeString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        return hours + ":" + minutes + ":" + sec;
    }

    public int getCurrentHour() {
        return seconds / 3600;
    }

    public int getMinutesPassedThisHour() {
        return (seconds % 3600) / 60;
    }

    public int getSecondsPassedThisMinute() {
        return seconds % 60;
    }
}
