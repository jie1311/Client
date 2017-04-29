package Inputs;

import entities.Airport;

/**
 * Created by jiezhang on 29/4/17.
 */
public class AirportInput {
    private boolean success;
    private String message;
    private Airport[] data;

    public AirportInput() {
    }

    public AirportInput(boolean success, String message, Airport[] data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Airport[] getData() {
        return data;
    }

    public void setData(Airport[] data) {
        this.data = data;
    }
}
