package ro.ctrln.java.inheritance;
                        //*** POJO -  Plain Old Java Object ***//

import ro.ctrln.java.util.ProjectUtils;

import java.util.Objects;

public class Battleship {
    public static final int ID = 1;//asa se declara o constanta

    protected String battleshipName;
    private int battleshipCapacity;

                        //*** Constructor ***//
//    public Battleship(){}
//
//    public Battleship(String battleshipName, int battleshipCapacity) {
//        this.battleshipName = battleshipName;
//        this.battleshipCapacity = battleshipCapacity;
//    }

                        //*** getter ***//
    public String getBattleshipName() {
        return battleshipName;
    }

    public int getBattleshipCapacity() {
        return battleshipCapacity;
    }
                         //*** setter ***//
    public void setBattleshipName(String battleshipName) {
        this.battleshipName = battleshipName;
    }

    public void setBattleshipCapacity(int battleshipCapacity){
        this.battleshipCapacity = battleshipCapacity;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "battleshipName='" + battleshipName + '\'' +
                ", battleshipCapacity=" + battleshipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return battleshipCapacity == that.battleshipCapacity && battleshipName.equals(that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleshipName, battleshipCapacity);
    }
    public void escapeProccedure(int escapePods){
        ProjectUtils.printMessage("Escape procedure initiated in Battleship class with " + escapePods + " escape pods");

    }
    public class EscapePod{
        private String EscapePod;
    }
    private class EscapePodTieFighter{
        private String EscapePod;
    }
}
