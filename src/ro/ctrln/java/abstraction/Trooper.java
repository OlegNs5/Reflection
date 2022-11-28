package ro.ctrln.java.abstraction;

import ro.ctrln.java.util.ProjectUtils;

public abstract class Trooper {

    private int numberOfCapabilities;

    public int getNumberOfCapabilities() {
        return this.numberOfCapabilities;
    }

    public void setNumberOfCapabilities(int numberOfCapabilities) {
        this.numberOfCapabilities = numberOfCapabilities;
    }

    public void fight(String enemy){
        ProjectUtils.printMessage("Fithing the enemy" + enemy);
    }

    public abstract String warCry(); //la fel ca si in "interfata" nu trebuie sa scriem si codul doar signatura

}
