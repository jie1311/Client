package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {

    private String id;

    private String iataCode;
    private String city;
    private double[] coordinate;

    public Airport() {
    }

    public Airport(String iataCode, String city, double[] coordinate) {
        this.iataCode = iataCode;
        this.city = city;
        this.coordinate = coordinate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double[] getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double[] coordinate) {
        this.coordinate = coordinate;
    }

    public String getAirport() {
        return String.format("%s %s", iataCode, city);
    }

    @Override
    public String toString() {
        return String.format("{\"iata\":\"%s\", \"city\":\"%s\", \"long\":%f, \"lat\":%f}",
                iataCode, city, coordinate[0], coordinate[1]);
    }
}

