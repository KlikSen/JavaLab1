package Task10;

import java.util.Scanner;

public class Day {
    private Date date;
    private Weather weather;

    public Day() {
        this.date = new Date();
        this.weather = new Weather();
    }

    public Day(final Date date) {
        this.date = date;
        this.weather = new Weather();
    }

    public Day(final Date date, final Weather weather) {
        this.date = date;
        this.weather = weather;
    }

    public Date getDate() { return date; }

    public void setDate(final Date day) {
        this.date = day;
    }

    public Weather getWeather() { return weather; }

    public void setWeather(final Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() { return date + " ===== " + weather;}
}
