package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {

    private String iata;
    private String city;
    private double lng;
    private double lat;

    public Airport() {
    }

    public Airport(String iata, String city, double lng, double lat) {
        this.iata = iata;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return String.format("{\"iata\":\"%s\", \"city\":\"%s\", \"lng\":%f, \"lat\":%f}",
                iata, city, lng, lat);
    }
}

