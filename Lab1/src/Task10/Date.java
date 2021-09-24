package Task10;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        final Scanner reader = new Scanner(System.in);

        System.out.println("Impute date: ");
        do {
            System.out.println("day: ");
            this.day = reader.nextInt();
        } while (this.day < 1 || this.day > 31);

        do {
            System.out.println("month: ");
            this.month = reader.nextInt();
        } while (this.month < 1 || this.month > 12);

        System.out.println("year: ");
        this.year = reader.nextInt();
    }

    public Date(final Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public Date(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }

    public void setDay(final int day) {
        this.day = day;
        convert();
    }

    public int getMonth() { return month; }

    public void setMonth(final int month) {
        this.month = month;
        convert();
    }

    public int getYear() { return year; }

    public void setYear(final int year) { this.year = year; }

    public void convert() {
        final boolean notCorrectDate = (this.day < 1 || this.day > 31) || (this.month < 1 || this.month > 12);
        do {
            if (day > 31) {
                day -= 31;
                month++;
            }
            if (month > 12) {
                month -= 12;
                year++;
            }
        } while (notCorrectDate);
    }

    @Override
    public String toString() { return day + "." + month + '.' + year; }
}
