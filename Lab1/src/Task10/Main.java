package Task10;

public class Main {
    public static void main(final String[] args) {
        final Day[] weatherCalendarForTheWeek = new Day[7];

        weatherCalendarForTheWeek[0] = new Day();
        for (int i = 1; i < weatherCalendarForTheWeek.length; i++){
            final Date nextDay = new Date(weatherCalendarForTheWeek[0].getDate());
            nextDay.setDay(nextDay.getDay() + i);

            weatherCalendarForTheWeek[i] = new Day(nextDay);
        }

        for (final Day daysOfWeek : weatherCalendarForTheWeek){
            System.out.println(daysOfWeek);
        }
    }
}
