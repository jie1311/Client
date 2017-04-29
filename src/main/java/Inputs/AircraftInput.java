package Inputs;

import entities.Aircraft;

/**
 * Created by jiezhang on 29/4/17.
 */
public class AircraftInput {
    private boolean success;
    private String message;
    private Aircraft[] data;

    public AircraftInput() {
    }

    public AircraftInput(boolean success, String message, Aircraft[] data) {
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

    public Aircraft[] getData() {
        return data;
    }

    public void setData(Aircraft[] data) {
        this.data = data;
    }
}
