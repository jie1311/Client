package entities;

/**
 * Created by jiezhang on 1/3/17.
 */
public class Route {
    private int distance;
    private boolean reachable;
    private Airport[] route;

    public Route() {
    }

    public Route(int distance, boolean reachable, Airport[] route) {
        this.distance = distance;
        this.reachable = reachable;
        this.route = route;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    public Airport[] getRoute() {
        return route;
    }

    public void setRoute(Airport[] route) {
        this.route = route;
    }

    @Override
    public String toString() {
        String routeS = "";
        try {
            for (Airport airport : route) {
                routeS += String.format("%s, ",airport.toString());
            }
            routeS = routeS.substring(0, routeS.length() - 2);
        } catch (Exception e) {

        }
        return String.format("{\"distance\": %s, \"reachable\":%s, \"route\":[%s]}", distance, reachable, routeS);
    }
}
