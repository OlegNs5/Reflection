package ro.ctrln.java.inheritance;

import ro.ctrln.java.util.ProjectUtils;

public class FalconHeavy extends Battleship implements Starship,Rocket {

    private String destination;

    @Override
    public void warp() {
        System.out.println("FalconHeavy doesn't warp! She goes to the moon!");
    }

    @Override
    public void setStarshipDestination(String destination) {
        ProjectUtils.printMessage(this.destination = getBattleshipName() + " goes to " + destination);//intoarce go to in star usege
        this.destination = getBattleshipName() + " goes to " + destination;

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return 0;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "FalconHeavy{" +
                " destination = " + destination +
                ", batlleshipName = " + getBattleshipName() +
                ", batlleshipCapacity = " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public void lauchCoutdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Lauch sequece " + i);
        }
    }

    @Override
    //Aceasta este o metoda mostenita din clasa Battlteship si este o metoda suprascrisa
    public void escapeProccedure(int escapePods) {
        // Apeleaza clasa parinte "Battleship" cu ajutorul keyword "super"
        super.escapeProccedure(escapePods);
        ProjectUtils.printMessage("We are in Falcon Heavy now: " + this.battleshipName);
        ProjectUtils.printMessage("Escape procedure initiated in Falcon Heavy class with " + escapePods + " escape pods");
    }

    public String escapeProccedure(boolean activated) {//Aceasta este o metoda de supraincarcare
        return activated ? "Escape procedure initiated!" : "Escape procedure abort";
    }

    public void escapeProccedure(int escapePods, boolean activated) {// Metodele/supraincarcare au acelasi nume dar parametri diferiti
        ProjectUtils.printMessage(escapeProccedure(activated));
        if (activated) {
            escapeProccedure(escapePods);
        }
    }

    // ... inseamna "varargs" - variable arguments - transfera un numar de variabile catre metoda noastra
    public void escapeProccedure(boolean... activated) {
        for (boolean active : activated) {
            ProjectUtils.printMessage("Activation sequence: " + active);
        }
    }
    public void escapeProccedure(){
        ProjectUtils.printMessage("Waiting for the escape procedure");
    }
}