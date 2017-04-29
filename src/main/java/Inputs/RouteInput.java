package Inputs;

import entities.Route;

/**
 * Created by jiezhang on 29/4/17.
 */
public class RouteInput {
    private boolean success;
    private String message;
    private Route data;

    public RouteInput() {
    }

    public RouteInput(boolean success, String message, Route data) {
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

    public Route getData() {
        return data;
    }

    public void setData(Route data) {
        this.data = data;
    }
}
