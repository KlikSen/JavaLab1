package Task10;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public static final int minDaysInMonth = 1;
    public static final int maxDaysInMonth = 31;
    public static final int minMonthsInYear = 1;
    public static final int maxMonthsInYear = 12;


    public Date() {
        setDate();
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

    public void setDate() {
        final Scanner reader = new Scanner(System.in);

//        int day = 0;
//        int month = 0;
//        int year = 0;

        System.out.println("Impute date: ");
        do {
            System.out.println("day: ");
            this.day = reader.nextInt();
        } while (this.day < minDaysInMonth || this.day > maxDaysInMonth);

        do {
            System.out.println("month: ");
            this.month = reader.nextInt();
        } while (this.month < minMonthsInYear || this.month > maxMonthsInYear);

        System.out.println("year: ");
        year = reader.nextInt();

       // new Date(day, month, year);
    }

    private void convert() {
        boolean notCorrectDate = this.day > maxDaysInMonth || this.month > maxMonthsInYear;
        do {
            if (this.day > 31) {
                this.day -= 31;
                this.month++;
            }
            if (this.month > 12) {
                this.month -= 12;
                this.year++;
            }
            notCorrectDate = this.day > maxDaysInMonth || this.month > maxMonthsInYear;
        } while (notCorrectDate);
    }

    @Override
    public String toString() { return day + "." + month + '.' + year; }
}
