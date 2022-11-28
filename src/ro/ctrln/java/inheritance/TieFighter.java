package ro.ctrln.java.inheritance;

import ro.ctrln.java.util.ProjectUtils;

public class TieFighter implements Starship {
private String destination;
    @Override
    public void warp() {
        ProjectUtils.printMessage("TieFighter is now in warp speed");
    }

    @Override
    public void setStarshipDestination(String destination) {
        this.destination = destination;

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return warpFactor * 5 * Math.pow(10,8);
    }

    @Override
    public String toString() {
        return "TieFitghter{" +
                "destination='" + destination  +'\'' +
                '}';
    }
}
