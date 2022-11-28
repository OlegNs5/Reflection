package ro.ctrln.java.inheritance;

import ro.ctrln.java.util.ProjectUtils;

/*implements  este    mostenirea din interfata*/
public class XWingStarfighter implements Starship {//interfata descrie un comportament

    private String destination;
    private int lightYearsToDestination;

    @Override
    public void warp() {
        ProjectUtils.printMessage("XWingStarfigther este acum in viteza warp! ");
    }

    @Override
    public void setStarshipDestination(String destination) {
        switch (destination) {
            case "base":
                this.destination = "Tatooine";
                break;
            case "empire":
                this.destination = "Curuscant";
            default:
                this.destination = "Unknown";
        }
    }

    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
       this.lightYearsToDestination = lightYearsToDestination;
        return Math.pow(warpFactor,3) * Math.pow(10,8);
    }
    @Override
    public String toString() {
        return "XWingStarfigther{" +
                "destination='" + destination + '\'' +
                ", lightYearsToDestination=" + lightYearsToDestination +
                '}';
    }
                            }
