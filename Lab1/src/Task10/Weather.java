package Task10;

import java.util.Scanner;

public class Weather {
    private int cloudiness;
    private String precipitation;
    private int speedOfWind;
    private int temperature;

    public static final int minCloudiness = 1;
    public static final int maxCloudiness = 10;
    public static final String[] precipitations = {"snow", "hail", "rain", "not"};
    public static final int minSpeedOfWind = 1;
    public static final int maxSpeedOfWind = 30;
    public static final int minTemperature = -50;
    public static final int maxTemperature = 50;

    public Weather() {
        setWeather();
    };

    public Weather(final int cloudiness, final String precipitation,
                   final int speedOfWind, final int temperature){
        this.cloudiness = cloudiness;
        this.precipitation = precipitation;
        this.speedOfWind = speedOfWind;
        this.temperature = temperature;
    }

    public int getCloudiness() { return cloudiness; }

    public void setCloudiness(final int cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getPrecipitation() { return precipitation; }

    public void setPrecipitation(final String precipitation) {
        this.precipitation = precipitation;
    }

    public int getSpeedOfWind() { return speedOfWind; }

    public void setSpeedOfWind(final int speedOfWind) {
        this.speedOfWind = speedOfWind;
    }

    public int getTemperature() { return temperature; }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public void setWeather() {
        final Scanner reader = new Scanner(System.in);
        boolean somePrecipitation = false;
//        int cloudiness = 0;
//        String precipitation = "";
//        int speedOfWind = 0;
//        int temperature = -100;

        do {
            System.out.println("Impute cloudiness from 1 to 10: ");
            this.cloudiness = reader.nextInt();
        } while (this.cloudiness < minCloudiness || this.cloudiness > maxCloudiness);

        do {
            System.out.println("Impute type of precipitation (snow, hail, rain, not): ");
            this.precipitation = reader.next();

            for (final String oneOfPrecipitation : precipitations){
                if (this.precipitation.equals(oneOfPrecipitation))
                    somePrecipitation = true;
            }
//            somePrecipitation = (this.precipitation.equals("snow")) ||
//                    (this.precipitation.equals("hail")) || (this.getPrecipitation().equals("rain")) ||
//                    (this.precipitation.equals("not"));
        } while (!somePrecipitation);

        do {
            System.out.println("Impute speed of wind: ");
            this.speedOfWind = reader.nextInt();
        } while (this.speedOfWind < minSpeedOfWind || this.speedOfWind > maxSpeedOfWind);

        do {
            System.out.println("Impute temperature: ");
            this.temperature = reader.nextInt();
        } while (this.temperature < minTemperature || this.temperature > maxTemperature);

  //      new Weather(cloudiness, precipitation, speedOfWind, temperature);
    }

    @Override
    public String toString() { return " Cloudiness: " + cloudiness + " Precipitation: " +
            precipitation + " Speed of wind: " + speedOfWind + "m/s Temperature: "
            + temperature + "degrees Celsius";}
}
