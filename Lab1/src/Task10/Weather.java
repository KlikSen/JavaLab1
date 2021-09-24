package Task10;

import java.util.Scanner;

public class Weather {
    private int cloudiness;
    private String precipitation;
    private int speedOfWind;
    private int temperature;

    public Weather() {
        final Scanner reader = new Scanner(System.in);
        boolean somePrecipitation;

        do {
            System.out.println("Impute cloudiness from 1 to 10: ");
            this.cloudiness = reader.nextInt();
        } while (this.cloudiness < 1 || this.cloudiness > 10);

        do {
            System.out.println("Impute type of precipitation (snow, hail, rain, not): ");
            this.precipitation = reader.next();
            somePrecipitation = (this.precipitation.equals("snow")) ||
                    (this.precipitation.equals("hail")) || (this.getPrecipitation().equals("rain")) ||
                    (this.precipitation.equals("not"));
        } while (!somePrecipitation);

        do {
            System.out.println("Impute speed of wind: ");
            this.speedOfWind = reader.nextInt();
        } while (this.speedOfWind < 1 || this.speedOfWind > 30);

        do {
            System.out.println("Impute temperature: ");
            this.temperature = reader.nextInt();
        } while (this.temperature < -50 || this.temperature > 50);
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

    @Override
    public String toString() { return " Cloudiness: " + cloudiness + " Precipitation: " +
            precipitation + " Speed of wind: " + speedOfWind + "m/s Temperature: "
            + temperature + "degrees Celsius";}
}
