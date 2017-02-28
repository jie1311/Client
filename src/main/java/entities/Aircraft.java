package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Aircraft {

    private String manufacturer;
    private String model;
    private String submodel;
    private int range;
    private int capacity;

    public Aircraft() {
    }

    public Aircraft(String manufacturer, String model, String subModel, int range, int capacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.submodel = subModel;
        this.range = range;
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSubmodel() {
        return submodel;
    }

    public void setSubmodel(String subModel) {
        this.submodel = subModel;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return String.format("%s %s-%s", manufacturer, model, submodel);
    }

    @Override
    public String toString() {
        return String.format("{\"manufacturer\":\"%s\", \"model\":\"%s\", \"submodel\":\"%s\", \"range\":%d, \"capacity\":%d}",
                manufacturer, model, submodel, range, capacity);
    }
}

