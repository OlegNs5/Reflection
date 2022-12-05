package ro.ctrln.java.inheritance;

import java.util.Objects;

public class ImperialStarDestroyer extends Battleship {

    private int numberOfDecks;

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;

    }

    public ImperialStarDestroyer() {
    }

    public ImperialStarDestroyer(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    private ImperialStarDestroyer(String battleshipName, int numberOfDecks) {
        this.battleshipName = battleshipName;
        this.numberOfDecks = numberOfDecks;
    }

    @Override
    public String toString() {
        return/* super.toString() +  //super apeleaza(mosteneste) classa parinte*/ "ImperialStarDestroyer{ " +
                "numberOfDecks = " + numberOfDecks +
                ", battleshipName = " + getBattleshipName() +
                ", battleshipCapacity = " + getBattleshipCapacity() +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ImperialStarDestroyer that = (ImperialStarDestroyer) o;
        return numberOfDecks == that.numberOfDecks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDecks);
    }
}

