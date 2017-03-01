package application.forms;

import javax.validation.constraints.NotNull;
public class RouteForm {

    @NotNull
    private String orgIata;

    @NotNull
    private String desIata;

    @NotNull
    private String range;

    public RouteForm() {
    }

    public String getOrgIata() {
        return orgIata;
    }

    public void setOrgIata(String orgIata) {
        this.orgIata = orgIata;
    }

    public String getDesIata() {
        return desIata;
    }

    public void setDesIata(String desIata) {
        this.desIata = desIata;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
