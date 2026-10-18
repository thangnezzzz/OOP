class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Entry {
    private Date date;
    private double distance;
    private int durationInMinutes;
    private String postRunFeeling;

    public Entry(Date date, double distance, int durationInMinutes, String postRunFeeling) {
        this.date = date;
        this.distance = distance;
        this.durationInMinutes = durationInMinutes;
        this.postRunFeeling = postRunFeeling;
    }

    public double pace() {
        return this.durationInMinutes / this.distance;
    }
}