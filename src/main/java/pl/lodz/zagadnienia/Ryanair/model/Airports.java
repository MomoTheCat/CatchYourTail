package pl.lodz.zagadnienia.Ryanair.model;

/**
 * Created by szymo on 11/03/2016.
 */
public class Airports {

    private String iataCode;
    private String name;
    private boolean base;
    private double latitude;
    private double longitude;
    private Country country;

    public Airports(String iataCode, String name, boolean base, double latitude, double longitude, Country country) {
        this.iataCode = iataCode;
        this.name = name;
        this.base = base;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBase() {
        return base;
    }

    public void setBase(boolean base) {
        this.base = base;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
